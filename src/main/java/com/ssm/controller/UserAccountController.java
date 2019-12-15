package com.ssm.controller;

import com.ssm.model.UserAccount;
import com.ssm.service.IUserAccountService;
import com.ssm.util.Bank;
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

    @RequestMapping("/getBank")
    @ResponseBody
    public String getBank(String bankId,String idCard ,String mobile,String name){

        String bank= Bank.getBank(bankId,idCard,mobile,name);

        return bank;
    }

    @RequestMapping("/getSFZ")
    @ResponseBody
    public String getSFZ(String idCard ,String name){

        Map<String, String> params = new HashMap<>();
        params.put("idcard", idCard);
        params.put("name", name);
        String result = null;
        try {
            result = SFZ.postForm( params);
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
        System.out.println(result);

        return result;
    }

    @RequestMapping("/getFileImg")
    @ResponseBody
    public String getFileImg(String filePath){

        String file = ImgFile.getFile(filePath);

        return file;
    }
}
