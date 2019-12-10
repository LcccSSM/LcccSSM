package com.ssm.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.model.SysDict;
import com.ssm.service.ISysDictService;
import com.ssm.util.JsonData;
import com.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
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
    public Map byPageBean(HttpServletRequest request,SysDict sysDict){
        JsonData jsonData = new JsonData();

        PageBean pageBean = new PageBean();
        pageBean.initPageBean(request,pageBean);
        if (null != pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        List<SysDict> list = sysDictService.listByPage(sysDict,pageBean);
        PageInfo pageInfo = new PageInfo(list);
        jsonData.setResult(list);
        jsonData.setTotal(pageInfo.getTotal());
        jsonData.setPage(pageInfo.getPages());
        jsonData.setRows(pageInfo.getPageNum());

        return jsonData;
    }


    @RequestMapping("/Dict_ByTypeMAXID")
    @ResponseBody
    public Map ByTypeMAXID(String dtype){
        JsonData jsonData = new JsonData();

        int maxid = sysDictService.ByTypeMAXID(dtype);
        jsonData.setResult(maxid);
        return jsonData;
    }

    @RequestMapping("/Dict_Add")
    @ResponseBody
    public int addDict(SysDict sysDict){
        int maxid = sysDictService.ByTypeMAXID(sysDict.getDtype());
        sysDict.setDintro(maxid);
        int i = sysDictService.insertSelective(sysDict);

        return i;
    }

    @RequestMapping("/Dict_Merge")
    @ResponseBody
    public int merge(SysDict sysDict){
        if (null!=sysDict.getDid()){
            int b = sysDictService.updateByPrimaryKeySelective(sysDict);

            return (b+1);
        }
        int maxid = sysDictService.ByTypeMAXID(sysDict.getDtype());
        sysDict.setDintro(maxid);
        int i = sysDictService.insertSelective(sysDict);

        return i;


    }


    @RequestMapping("/Dict_Del")
    @ResponseBody
    public int delDict(Integer did){
        int i = sysDictService.deleteByPrimaryKey(new Long(did));

        return i;
    }
    @RequestMapping("/Dict_Update")
    @ResponseBody
    public int updateDict(SysDict sysDict){
        int i = sysDictService.updateByPrimaryKeySelective(sysDict);

        return i;
    }


}
