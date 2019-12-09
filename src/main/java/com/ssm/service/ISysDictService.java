package com.ssm.service;

import com.ssm.model.SysDict;
import com.ssm.util.PageBean;

import java.util.List;

public interface ISysDictService {
    int deleteByPrimaryKey(Long did);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long did);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);

    //根据类型查询
    List<SysDict> ByDtypeList(String dtype);

    List<SysDict> listAll();

    //分页格式
    List<SysDict> listByPage(SysDict dict, PageBean pageBean);

    //返回单个类型的最大序号
    int ByTypeMAXID(String dtype);
}