package com.ssm.service.impl;

import com.ssm.service.ISysDictService;
import com.ssm.util.PageBean;
import com.ssm.mapper.SysDictMapper;
import com.ssm.model.SysDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISysDictServiceImpl implements ISysDictService {

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

    @Override
    public List<SysDict> ByDtypeList(String dtype) {
        return sysDictMapper.ByDtypeList(dtype);
    }

    @Override
    public String ByType(String dtype, int dintro) {
        return sysDictMapper.ByType(dtype,dintro);
    }

    @Override
    public List<SysDict> listAll() {
        return sysDictMapper.listAll();
    }

    @Override
    public List<SysDict> listByPage(SysDict dict, PageBean pageBean) {
        return this.sysDictMapper.listByPage(dict);
    }

    @Override
    public int ByTypeMAXID(String dtype) {
        return sysDictMapper.ByTypeMAXID(dtype);
    }

}
