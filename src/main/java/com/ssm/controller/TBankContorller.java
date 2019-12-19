package com.ssm.controller;

import com.ssm.model.StateStatus;
import com.ssm.model.TBank;
import com.ssm.service.IBankService;
import com.ssm.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
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

    @RequestMapping(value = "/inserBank")
    @ResponseBody
    public int inserBank(TBank bank) {
        int i= iBankService.insertSelective(bank);
        return  i;
    }

    @RequestMapping(value = "/selectBank")
    @ResponseBody
    public List<TBank> selectBank(Integer auserid) {
        List<TBank> i= iBankService.selectBank(auserid);
        return  i;
    }
}
