package com.ssm.service;

import com.ssm.model.TBank;

public interface IBankService {
    int deleteByPrimaryKey(Integer abid);

    int insert(TBank record);

    int insertSelective(TBank record);

    TBank selectByPrimaryKey(Integer abid);

    int updateByPrimaryKeySelective(TBank record);

    int updateByPrimaryKey(TBank record);
}