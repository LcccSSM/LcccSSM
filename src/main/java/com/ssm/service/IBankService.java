package com.ssm.service;

import com.ssm.model.TBank;

import java.util.List;

public interface IBankService {
    int deleteByPrimaryKey(Integer abid);

    int insert(TBank record);

    int insertSelective(TBank record);

    TBank selectByPrimaryKey(Integer abid);

    int updateByPrimaryKeySelective(TBank record);

    int updateByPrimaryKey(TBank record);

    List<TBank> selectBank(Integer auserid);
}