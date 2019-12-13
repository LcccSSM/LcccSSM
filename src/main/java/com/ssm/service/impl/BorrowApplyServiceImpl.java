package com.ssm.service.impl;

import com.ssm.mapper.BorrowApplyMapper;
import com.ssm.model.BorrowApply;
import com.ssm.service.IBorrowApplyService;
import com.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowApplyServiceImpl implements IBorrowApplyService {

    @Autowired
    private BorrowApplyMapper borrowApplyMapper;

    @Override
    public int deleteByPrimaryKey(Integer jid) {
        return borrowApplyMapper.deleteByPrimaryKey(jid);
    }

    @Override
    public int insert(BorrowApply record) {
        return borrowApplyMapper.insert(record);
    }

    @Override
    public int insertSelective(BorrowApply record) {
        return borrowApplyMapper.insertSelective(record);
    }

    @Override
    public BorrowApply selectByPrimaryKey(Integer jid) {
        return borrowApplyMapper.selectByPrimaryKey(jid);
    }

    @Override
    public int updateByPrimaryKeySelective(BorrowApply record) {
        return borrowApplyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BorrowApply record) {
        return borrowApplyMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<BorrowApply> ByPageAll(BorrowApply borrowApply, PageBean pageBean) {
        return borrowApplyMapper.ByPageAll(borrowApply);
    }
}
