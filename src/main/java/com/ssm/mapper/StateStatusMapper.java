package com.ssm.mapper;

import com.ssm.model.StateStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface StateStatusMapper {
    int deleteByPrimaryKey(Integer asid);

    int insert(StateStatus record);

    int insertSelective(StateStatus record);

    StateStatus selectByPrimaryKey(Integer asid);

    int updateByPrimaryKeySelective(StateStatus record);

    int updateByPrimaryKey(StateStatus record);

    //根据用户ID查询实名信息
    StateStatus selectByAuserid(Integer asid);

}