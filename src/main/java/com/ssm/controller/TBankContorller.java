package com.ssm.controller;

import com.ssm.service.IBankService;
import com.ssm.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TBankContorller {
    @Autowired
    private IBankService iBankService;

    //银行卡验证接口
//    @RequestMapping(value = "/Bank")
//    @ResponseBody
//    public Map Bank(Bank bank) {
//
//
//
//
//
//    }

}
