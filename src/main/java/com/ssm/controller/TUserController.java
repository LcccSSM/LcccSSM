package com.ssm.controller;

import com.ssm.dto.MyYZM;
import com.ssm.model.Tuser;
import com.ssm.service.IUserService;
import com.ssm.util.JsonData;
import com.ssm.util.PasswordHelper;
import com.ssm.util.SendSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TUserController {
    JsonData jsonData;

    //手机短信
    SendSms sendSms = new SendSms();

    @Autowired
    private IUserService iUserService;

    //短信验证接口
    @RequestMapping(value = "/YZM")
    @ResponseBody
    public Map YZM(@ModelAttribute Tuser tuser) {
        jsonData = new JsonData();
        Long phone = tuser.getPhone();
        String yzm = sendSms.SJ(phone);
        jsonData.setCode(1);
        jsonData.setMessage(yzm);
        return jsonData;
    }

    //用户注册接口
    @RequestMapping(value = "/addUser")
    @ResponseBody
    public Map addUser(@ModelAttribute Tuser tuser, MyYZM myYZM) {
        //MD5加密
        PasswordHelper passwordHelper = new PasswordHelper();
        //盐
        String salt = passwordHelper.createSalt();
        //凭证+盐加密后得到的密码
        String credentials = passwordHelper.createCredentials(tuser.getLoginpass(), salt);
        System.out.println("密文" + credentials);
        //验证密码是否正确
//        boolean b = passwordHelper.checkCredentials("0612", salt, credentials);
        jsonData = new JsonData();
        tuser.setLoginpass(credentials);
        tuser.setSalt(salt);
        int i = iUserService.insertSelective(tuser);
        if (1 == i) {
            jsonData.setMessage("注册成功");
            jsonData.setCode(1);
        } else {
            jsonData.setMessage("注册失败");
            jsonData.setCode(0);
        }
        return jsonData;
    }

    //根据用户名查询信息对象接口
    @RequestMapping(value = "selectName")
    @ResponseBody
    public Tuser selectName(@ModelAttribute Tuser tuser) {
        Tuser user = iUserService.selectName(tuser);
        return user;
    }
    //根据用户名查询信息JSON接口
    @RequestMapping(value = "selectNameJS")
    @ResponseBody
    public JsonData selectNameJS(@ModelAttribute Tuser tuser) {
        jsonData = new JsonData();
        Tuser user = iUserService.selectName(tuser);
        if(user == null){
            jsonData.setCode(1);
            jsonData.setMessage("没有该用户！");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("用户名已存在！");
        }
        return jsonData;
    }


    //用户登录，账号密码登录接口
    @RequestMapping(value = "selectNamePass")
    @ResponseBody
    public JsonData selectNamePass(@ModelAttribute Tuser tuser) {
        jsonData = new JsonData();
        //MD5加密
        PasswordHelper passwordHelper = new PasswordHelper();
        //根据用户名查询用户信息
        Tuser user = selectName(tuser);
        // 获取该用户的盐
        String salt = user.getSalt();
        System.out.println("盐:" + salt);
        //凭证+盐加密后得到的密文
        String credentials = passwordHelper.createCredentials(tuser.getLoginpass(), salt);
        System.out.println("密文：" + credentials);
        //使用密文查询
        tuser.setLoginpass(credentials);
        //查询用户
        Tuser userAll = iUserService.selectNamePass(tuser);
        System.out.println("aaa:"+userAll);
        if (null != userAll) {
            //json格式转出
            jsonData.setCode(1);
            jsonData.setMessage("登录成功！");
        } else {
            jsonData.setCode(0);
            jsonData.setMessage("账号或密码错误");
        }
        return jsonData;
    }

    //用户登录，手机登录接口
    @RequestMapping(value="selectPhone")
    @ResponseBody
    public Tuser selectPhone(@ModelAttribute Tuser tuser){
        Tuser user = iUserService.selectPhone(tuser);
        return  user;
    };
    //用户注册验证手机是否已经存在接口
    @RequestMapping(value="selectPhoneJS")
    @ResponseBody
    public JsonData selectPhoneJS(@ModelAttribute Tuser tuser){
        jsonData = new JsonData();
        Tuser user = iUserService.selectPhone(tuser);
        if(user == null){
            jsonData.setCode(1);
            jsonData.setMessage("该手机用户不存在！");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("该手机号已注册！");
        }
        return  jsonData;
    };


}
