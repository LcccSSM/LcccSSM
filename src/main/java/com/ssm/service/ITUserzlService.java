package com.ssm.service;

import com.ssm.model.TUserzl;

public interface ITUserzlService {
    int deleteByPrimaryKey(Integer zuid);

    int insert(TUserzl record);

    int insertSelective(TUserzl record);

    TUserzl selectByPrimaryKey(Integer zuid);

    int updateByPrimaryKeySelective(TUserzl record);

    int updateByPrimaryKey(TUserzl record);

    TUserzl selectByUserid(TUserzl tserzl);
}