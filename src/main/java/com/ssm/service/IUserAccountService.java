package com.ssm.service;

import com.ssm.model.UserAccount;

public interface IUserAccountService {
    int deleteByPrimaryKey(Integer aid);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);

    UserAccount  getByUid(Integer useid);




}