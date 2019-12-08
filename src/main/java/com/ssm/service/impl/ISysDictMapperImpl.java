package com.ssm.service.impl;

import com.ssm.mapper.SysDictMapper;
import com.ssm.model.SysDict;
import com.ssm.service.ISysDictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ISysDictMapperImpl implements ISysDictMapper {

    @Autowired
    private SysDictMapper sysDictMapper;


    @Override
    public int deleteByPrimaryKey(Long did) {
        return sysDictMapper.deleteByPrimaryKey(did);
    }

    @Override
    public int insert(SysDict record) {
        return sysDictMapper.insert(record);
    }

    @Override
    public int insertSelective(SysDict record) {
        return sysDictMapper.insertSelective(record);
    }

    @Override
    public SysDict selectByPrimaryKey(Long did) {
        return sysDictMapper.selectByPrimaryKey(did);
    }

    @Override
    public int updateByPrimaryKeySelective(SysDict record) {
        return sysDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysDict record) {
        return sysDictMapper.updateByPrimaryKey(record);
    }
}
