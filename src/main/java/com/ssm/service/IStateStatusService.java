package com.ssm.service;

import com.ssm.model.StateStatus;
import org.springframework.stereotype.Repository;

public interface IStateStatusService {
    int deleteByPrimaryKey(Integer asid);

    int insert(StateStatus record);

    int insertSelective(StateStatus record);

    StateStatus selectByPrimaryKey(Integer asid);

    int updateByPrimaryKeySelective(StateStatus record);

    int updateByPrimaryKey(StateStatus record);
}