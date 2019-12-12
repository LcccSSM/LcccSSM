package com.ssm.mapper;

import com.ssm.model.UserAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);

    UserAccount  getByUid(int useid);



}