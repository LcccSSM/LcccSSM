package com.ssm.service;

import com.ssm.model.BorrowApply;
import com.ssm.util.PageBean;

import java.util.List;

public interface IBorrowApplyService {
    int deleteByPrimaryKey(Integer jid);

    int insert(BorrowApply record);

    int insertSelective(BorrowApply record);

    BorrowApply selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(BorrowApply record);

    int updateByPrimaryKey(BorrowApply record);

    List<BorrowApply> ByPageAll(BorrowApply borrowApply, PageBean pageBean);

}