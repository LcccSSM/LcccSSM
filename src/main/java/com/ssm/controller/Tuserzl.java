package com.ssm.controller;

import com.ssm.model.TUserzl;
import com.ssm.service.ITUserzlService;
import com.ssm.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tuserzl {
    //JSON
    JsonData jsonData;
    @Autowired
    private ITUserzlService itUserzlService;

    //根据用户id查询个人状况
    @RequestMapping(value = "/selectByTuserzl")
    @ResponseBody
    public TUserzl selectByTuserzl(TUserzl tUserzl) {
        TUserzl userzl = itUserzlService.selectByUserid(tUserzl);
        return  userzl;
    }


}
