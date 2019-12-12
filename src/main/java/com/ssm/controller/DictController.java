package com.ssm.controller;

import com.github.pagehelper.Page;
import com.ssm.model.SysDict;
import com.ssm.service.ISysDictService;
import com.ssm.util.JsonData;
import com.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DictController {

    @Autowired
    private ISysDictService sysDictService;


    @RequestMapping("/Dict_bydtype")
    @ResponseBody
    public List<SysDict> byDtype(String dtype){
        List<SysDict> dictList = sysDictService.ByDtypeList(dtype);

        return dictList;
    }

    @RequestMapping("/Dict_listAll")
    @ResponseBody
    public Map listAll(){
        JsonData jsonData = new JsonData();
        List<SysDict> list = sysDictService.listAll();
        jsonData.setResult(list);
        jsonData.setTotal(list.size());

        return jsonData;
    }

    @RequestMapping("/Dict_byPageBean")
    @ResponseBody
    public List<SysDict> byPageBean(SysDict sysDict){
        PageBean pageBean = new PageBean();
//        pageBean.initPageBean();
        List<SysDict> list = sysDictService.listByPage(sysDict,pageBean);

        return list;
    }



}
