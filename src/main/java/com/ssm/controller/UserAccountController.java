package com.ssm.controller;

import com.ssm.model.StateStatus;
import com.ssm.model.Tuser;
import com.ssm.model.UserAccount;
import com.ssm.service.IStateStatusService;
import com.ssm.service.IUserAccountService;
import com.ssm.service.IUserService;
import com.ssm.util.Bank;
import com.ssm.util.Face;
import com.ssm.util.ImgFile;
import com.ssm.util.SFZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserAccountController {

    @Autowired
    private IUserAccountService userAccountService;

    @Autowired
    private IStateStatusService statusService;

    @Autowired
    private IUserService userService;

    @RequestMapping("/UAccount_byAdd")
    public int byAdd(UserAccount userAccount){

        int i = userAccountService.insertSelective(userAccount);

        return i;
    }


    @RequestMapping("/UAccount_byUpdate")
    public int byUpdate(UserAccount userAccount){

        int i = userAccountService.updateByPrimaryKeySelective(userAccount);

        return i;
    }

    @RequestMapping("/UAccount_getByUserid")
    @ResponseBody
    public UserAccount getByUserid(int userid){

        UserAccount userAccount = userAccountService.getByUid(userid);

        return userAccount;
    }

    @RequestMapping(value="/getBank",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String getBank(String bankId,String idCard ,String mobile,String name){

        String bank= Bank.getBank(bankId,idCard,mobile,name);

        return bank;
    }

    @RequestMapping(value="/getSFZ",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String getSFZ(String idCard ,String name){
        Map<String, String> params = new HashMap<>();
        params.put("idcard", idCard);
        params.put("name", name);
        String result = null;
        try {
            System.out.println("jinlaile");
            result = SFZ.postForm( params);
            System.out.println("result1    :"+result);
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
        System.out.println(result);

        return result;
    }

    @RequestMapping(value="/getFileImg",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String getFileImg(String filePath){

        String file = ImgFile.getFile(filePath);

        return file;
    }

    @RequestMapping(value="/getFace",produces="text/html;charset=UTF-8")
    @ResponseBody
    public String getFace(String idCard,String name,String image){
        Map<String, String> params = new HashMap<>();
        params.put("idcard", idCard);
        params.put("name", name);
        params.put("image",image);
        try {
            String result = Face.postForm(params);
            return result;
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
    @RequestMapping("/insertSFZ")
    @ResponseBody
    public int insertSFZ(StateStatus stateStatus){

        int i = statusService.insertSelective(stateStatus);

        return i;
    }

    @RequestMapping("/updatePhone")
    @ResponseBody
    public int updatePhone(Tuser tuser){

        int i = userService.updateByPrimaryKeySelective(tuser);

        return i;
    }
}
