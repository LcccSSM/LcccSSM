package com.ssm.mapper;

import com.ssm.model.BorrowApply;

import java.util.List;

public interface BorrowApplyMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(BorrowApply record);

    int insertSelective(BorrowApply record);

    BorrowApply selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(BorrowApply record);

    int updateByPrimaryKey(BorrowApply record);

    List<BorrowApply> ByPageAll(BorrowApply borrowApply);

}