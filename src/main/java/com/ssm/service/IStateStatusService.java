package com.ssm.service;

import com.ssm.model.StateStatus;

public interface IStateStatusService {
    int deleteByPrimaryKey(Integer asid);

    int insert(StateStatus record);

    int insertSelective(StateStatus record);

    StateStatus selectByPrimaryKey(Integer asid);

    int updateByPrimaryKeySelective(StateStatus record);

    int updateByPrimaryKey(StateStatus record);

    //根据用户ID查询实名信息
    StateStatus selectByAuserid(Integer asid);
}