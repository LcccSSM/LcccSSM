package com.ssm.mapper;

import com.ssm.model.TBank;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TBankMapper {
    int deleteByPrimaryKey(Integer abid);

    int insert(TBank record);

    int insertSelective(TBank record);

    TBank selectByPrimaryKey(Integer abid);

    int updateByPrimaryKeySelective(TBank record);

    int updateByPrimaryKey(TBank record);

    List<TBank> selectBank(Integer auserid);
}