package com.ssm.service.impl;

import com.ssm.mapper.StateStatusMapper;
import com.ssm.model.StateStatus;
import com.ssm.service.IStateStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateStatusServiceImpl implements IStateStatusService {
    @Autowired
    private StateStatusMapper stateStatusMapper;

    @Override
    public int deleteByPrimaryKey(Integer asid) {
        return 0;
    }

    @Override
    public int insert(StateStatus record) {
        return 0;
    }

    @Override
    public int insertSelective(StateStatus record) {
        return stateStatusMapper.insertSelective(record);
    }

    @Override
    public StateStatus selectByPrimaryKey(Integer asid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(StateStatus record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StateStatus record) {
        return 0;
    }
}
