package com.ssm.controller;

import com.ssm.dto.MyYZM;
import com.ssm.model.Tuser;
import com.ssm.service.IUserService;
import com.ssm.util.Email;
import com.ssm.util.JsonData;
import com.ssm.util.PasswordHelper;
import com.ssm.util.SendSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class TUserController {
    JsonData jsonData;

    //手机短信
    SendSms sendSms = new SendSms();

    @Autowired
    private IUserService iUserService;

    //手机短信验证接口
    @RequestMapping(value = "/YZM")
    @ResponseBody
    public Map YZM(Tuser tuser) {
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
    public Map addUser(Tuser tuser, MyYZM myYZM) {
        //MD5加密
        PasswordHelper passwordHelper = new PasswordHelper();
        //盐
        String salt = passwordHelper.createSalt();
        //凭证+盐加密后得到的密码
        String credentials = passwordHelper.createCredentials(tuser.getLoginpass(), salt);
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
    @RequestMapping(value = "/selectName")
    @ResponseBody
    public Tuser selectName(Tuser tuser) {
        Tuser user = iUserService.selectName(tuser);
        String a = user.getEmail().substring(4, 8);
        user.setEmail(user.getEmail().replace(user.getEmail().substring(4, 8),"****"));
        return user;
    }
    //根据用户名查询信息JSON接口
    @RequestMapping(value = "/selectNameJS")
    @ResponseBody
    public JsonData selectNameJS(Tuser tuser) {
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
    @RequestMapping(value = "/selectNamePass")
    @ResponseBody
    public JsonData selectNamePass(Tuser tuser) {
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
    @RequestMapping(value="/selectPhone")
    @ResponseBody
    public Tuser selectPhone(Tuser tuser){
        Tuser user = iUserService.selectPhone(tuser);
        return  user;
    };
    //用户注册验证手机是否已经存在接口
    @RequestMapping(value="/selectPhoneJS")
    @ResponseBody
    public JsonData selectPhoneJS(Tuser tuser){
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

    //用户绑定邮箱接口
    @RequestMapping(value="/addUserEmail")
    @ResponseBody
    public JsonData addUserEmail(Tuser tuser){
        jsonData = new JsonData();
        //根据用户名查询用户
        Tuser userinfo = iUserService.selectName(tuser);
        //吧用户ID赋值
        tuser.setUserid(userinfo.getUserid());
        tuser.setEmailcheck(1);
        //根据用户ID绑定邮箱
        int i = iUserService.updateByPrimaryKeySelective(tuser);
        if(i == 1){
            jsonData.setCode(1);
            jsonData.setMessage("邮箱绑定成功");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("邮箱绑定失败");
        }
        return  jsonData;
    };
    //查询邮箱是否已注册接口
    @RequestMapping(value="/selectEmail")
    @ResponseBody
    public JsonData selectEmail(Tuser tuser){
        jsonData = new JsonData();
        Tuser user = iUserService.selectEmail(tuser);
        if(user == null){
            jsonData.setCode(1);
            jsonData.setMessage("邮箱未注册！");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("邮箱已注册！");
        }
        return  jsonData;
    };
    //邮箱验证码
    @RequestMapping(value="/EmailYZM")
    @ResponseBody
    public JsonData EmailYZM(Tuser tuser){
        jsonData = new JsonData();
        Email email = new Email();
        String emailYZM = email.sendMail(tuser.getEmail());
        jsonData.setCode(1);
        jsonData.setMessage(emailYZM);
        return jsonData;
    };
    //用户修改手机号码接口
    @RequestMapping(value="/UpdataUser")
    @ResponseBody
    public JsonData UpdataUser(Tuser tuser){
        jsonData = new JsonData();
        //根据用户名查询用户
        Tuser userinfo = iUserService.selectName(tuser);
        //吧用户ID赋值
        tuser.setUserid(userinfo.getUserid());
        //修改
        int i = iUserService.updateByPrimaryKeySelective(tuser);
        if(i == 1){
            jsonData.setCode(1);
            jsonData.setMessage("修改成功");
        }else{
            jsonData.setCode(0);
            jsonData.setMessage("修改失败");
        }
        return  jsonData;
    };
    //用户修改密码接口
    @RequestMapping(value="/UpdataUserPass")
    @ResponseBody
    public JsonData UpdataUserPass(Tuser tuser){
        //MD5加密
        PasswordHelper passwordHelper = new PasswordHelper();
        //盐
        String salt = passwordHelper.createSalt();
        //凭证+盐加密后得到的密码
        String credentials = passwordHelper.createCredentials(tuser.getLoginpass(), salt);
        //密文赋值
        tuser.setLoginpass(credentials);
        //盐赋值
        tuser.setSalt(salt);
        JsonData jsonData = UpdataUser(tuser);
        return jsonData;
    };

    //用户添加头像
    @RequestMapping(value="/UpdataImage")
    @ResponseBody
    public JsonData imageupload(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "file", required = false) MultipartFile file, @RequestParam(value = "asuserid", required = false) Long asuserid) throws IOException {
        System.out.println(file.getOriginalFilename());
        String fileRealName = file.getOriginalFilename(); //获得原始文件名;
        int pointIndex = fileRealName.indexOf(".");  //点号的位置
        String fileSuffix = fileRealName.substring(pointIndex);  //截取文件后缀
        String pic_time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String saveFile = pic_time + fileSuffix;
        String filePath = "/uploads" + File.separator + saveFile;
        String realPath = request.getServletContext().getRealPath(filePath);
        jsonData = new JsonData();
        if (!file.isEmpty()) {
            jsonData.setCode(1);
            jsonData.setMessage("上传成功");
            file.transferTo(new File(realPath));
        } else {
            jsonData.setCode(0);
            jsonData.setMessage("上传失败");
        }
        return  jsonData;
    }


}
