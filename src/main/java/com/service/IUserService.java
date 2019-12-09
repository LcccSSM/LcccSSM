package com.service;

import com.model.Tuser;
import org.springframework.stereotype.Repository;

public interface IUserService {
    int deleteByPrimaryKey(Integer userid);

//  用户注册
    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
}