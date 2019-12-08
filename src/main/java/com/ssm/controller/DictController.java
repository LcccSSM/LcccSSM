package com.ssm.controller;

import com.ssm.model.SysDict;
import com.ssm.service.ISysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DictController {

    @Autowired
    private ISysDictService sysDictService;


    @RequestMapping("/Dict_add")
    @ResponseBody
    public String addDict(String dtype){
        List<SysDict> dictList = sysDictService.ByDtypeList(dtype);

        return null;
    }




}
