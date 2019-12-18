package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.model.SysDict;
import com.ssm.model.TFunction;
import com.ssm.service.IFunctionService;
import com.ssm.service.ISysDictService;
import com.ssm.util.JsonData;
import com.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FunctionController {

    @Autowired
    private IFunctionService functionService;

    @RequestMapping(value="/listByFunction")
    @ResponseBody
    public  Map<String,Object> listByFunction(){
        List<TFunction> functions = functionService.listByFunction(10);
        Map<String,Object> map = new HashMap<>();
        map.put("result",functions);
        return map;
    }


}
