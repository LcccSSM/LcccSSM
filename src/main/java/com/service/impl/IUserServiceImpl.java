package com.service.impl;

import com.mapper.TuserMapper;
import com.model.Tuser;
import com.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    private TuserMapper tuserMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(Tuser record) {
        return 0;
    }

//    用户注册
    @Override
    public int insertSelective(Tuser record) {
        return tuserMapper.insert(record);
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
}
