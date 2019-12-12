package com.ssm.service.impl;

import com.ssm.mapper.UserAccountMapper;
import com.ssm.model.UserAccount;
import com.ssm.service.IUserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements IUserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return userAccountMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public int insert(UserAccount record) {
        return userAccountMapper.insert(record);
    }

    @Override
    public int insertSelective(UserAccount record) {
        return userAccountMapper.insertSelective(record);
    }

    @Override
    public UserAccount selectByPrimaryKey(Integer aid) {
        return userAccountMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAccount record) {
        return userAccountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserAccount record) {
        return userAccountMapper.updateByPrimaryKey(record);
    }

    @Override
    public UserAccount getByUid(Integer useid) {
        return userAccountMapper.getByUid(useid);
    }
}
