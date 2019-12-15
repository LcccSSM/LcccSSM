package com.ssm.service.impl;

import com.ssm.mapper.TuserMapper;
import com.ssm.model.Tuser;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private TuserMapper tuserMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    //    用户注册
    @Override
    public int insert(Tuser record) {
        return tuserMapper.insert(record);
    }

    @Override
    public int insertSelective(Tuser record) {
        return tuserMapper.insertSelective(record);
    }

    @Override
    public Tuser selectByPrimaryKey(Integer userid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Tuser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Tuser record) {
        return 0;
    }

    @Override
    public Tuser selectName(Tuser tuser) {
        return tuserMapper.selectName(tuser);
    }

    @Override
    public Tuser selectNamePass(Tuser tuser) {
        return tuserMapper.selectNamePass(tuser);
    }

    @Override
    public Tuser selectPhone(Tuser tuser) {
        return tuserMapper.selectPhone(tuser);
    }
}
