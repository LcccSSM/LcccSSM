package com.ssm.service;

import com.ssm.util.PageBean;
import com.ssm.model.SysDict;

import java.util.List;

public interface ISysDictService {
    int deleteByPrimaryKey(Long did);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long did);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);

    List<SysDict> ByDtypeList(String dtype);

    List<SysDict> listAll();

    List<SysDict> listByPage(SysDict dict, PageBean pageBean);
}