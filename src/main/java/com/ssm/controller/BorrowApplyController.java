package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.model.BorrowApply;
import com.ssm.service.IBorrowApplyService;
import com.ssm.util.JsonData;
import com.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class BorrowApplyController {

    @Autowired
    private IBorrowApplyService borrowApplyService;


    @RequestMapping("/Loan_ByPageAll")
    @ResponseBody
    public Map ByPageAll(HttpServletRequest request, BorrowApply borrowApply){
        JsonData jsonData = new JsonData();

        PageBean pageBean = new PageBean();
        pageBean.initPageBean(request,pageBean);

        if (null != pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        List<BorrowApply> list = borrowApplyService.ByPageAll(borrowApply, pageBean);
        System.out.println(System.currentTimeMillis());
        PageInfo pageInfo = new PageInfo(list);
        jsonData.setResult(list);
        jsonData.setTotal(pageInfo.getTotal());
        jsonData.setPage(pageInfo.getPages());
        jsonData.setRows(pageInfo.getPageNum());

        return jsonData;

    }


    @RequestMapping("/loan_ByAdd")
    @ResponseBody
    public int loanAdd(BorrowApply borrowApply){

        borrowApply.setAddtime(System.currentTimeMillis()+"");

        int i = borrowApplyService.insertSelective(borrowApply);

        return i;
    }


    @RequestMapping("/loan_ByDel")
    @ResponseBody
    public int loanDel(int jid){

        int i = borrowApplyService.deleteByPrimaryKey(jid);

        return i;

    }


    @RequestMapping("/loan_ByUpdate")
    @ResponseBody
    public int ByUpdate(BorrowApply borrowApply){

        int i = borrowApplyService.updateByPrimaryKeySelective(borrowApply);

        return i;
    }




}
