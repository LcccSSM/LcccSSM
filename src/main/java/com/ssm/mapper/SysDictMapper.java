package com.ssm.mapper;

import com.ssm.model.SysDict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysDictMapper {
    int deleteByPrimaryKey(Long did);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long did);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);

    //根据类型查询
    List<SysDict> ByDtypeList(String dtype);

    //根据类型以及序号返回详细数据
    String ByType(String dtype,int dintro);

    List<SysDict> listAll();

    //分页格式
    List<SysDict> listByPage(SysDict dict);

    //返回单个类型的最大序号
    int ByTypeMAXID(String dtype);

}