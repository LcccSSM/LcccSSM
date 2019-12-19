package com.ssm.service.impl;

import com.ssm.mapper.TUserzlMapper;
import com.ssm.model.TUserzl;
import com.ssm.service.ITUserzlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ITUserzlServiceImpl implements ITUserzlService {

    @Autowired
    private TUserzlMapper tUserzlMapper;

    @Override
    public int deleteByPrimaryKey(Integer zuid) {
        return 0;
    }

    @Override
    public int insert(TUserzl record) {
        return 0;
    }

    @Override
    public int insertSelective(TUserzl record) {
        return 0;
    }

    @Override
    public TUserzl selectByPrimaryKey(Integer zuid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TUserzl record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TUserzl record) {
        return 0;
    }

    @Override
    public TUserzl selectByUserid(TUserzl tserzl) {
        return tUserzlMapper.selectByUserid(tserzl);
    }
}
