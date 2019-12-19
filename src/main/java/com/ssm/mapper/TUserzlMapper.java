package com.ssm.mapper;

import com.ssm.model.TUserzl;

public interface TUserzlMapper {
    int deleteByPrimaryKey(Integer zuid);

    int insert(TUserzl record);

    int insertSelective(TUserzl record);

    TUserzl selectByPrimaryKey(Integer zuid);

    int updateByPrimaryKeySelective(TUserzl record);

    int updateByPrimaryKey(TUserzl record);

    TUserzl selectByUserid(TUserzl tserzl);
}