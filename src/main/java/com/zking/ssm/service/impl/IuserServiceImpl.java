package com.zking.ssm.service.impl;

import com.model.Tuser;
import com.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class IuserServiceImpl implements IUserService {
    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(Tuser record) {
        return 0;
    }

    @Override
    public int insertSelective(Tuser record) {
        return 0;
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
