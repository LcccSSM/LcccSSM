package com.ssm.mapper;

import com.ssm.model.SysDict;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDictMapper {
    int deleteByPrimaryKey(Long did);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long did);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
}