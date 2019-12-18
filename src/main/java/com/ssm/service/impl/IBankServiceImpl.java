package com.ssm.service.impl;

import com.ssm.mapper.TBankMapper;
import com.ssm.model.TBank;
import com.ssm.service.IBankService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class IBankServiceImpl implements IBankService {
    @Autowired
    private TBankMapper tBankMapper;

    @Override
    public int deleteByPrimaryKey(Integer abid) {
        return 0;
    }

    @Override
    public int insert(TBank record) {
        return 0;
    }

    @Override
    public int insertSelective(TBank record) {
        return tBankMapper.insertSelective(record);
    }

    @Override
    public TBank selectByPrimaryKey(Integer abid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TBank record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TBank record) {
        return 0;
    }
}
