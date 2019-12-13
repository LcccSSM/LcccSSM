package com.ssm.controller;

import com.ssm.model.UserAccount;
import com.ssm.service.IUserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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



}
