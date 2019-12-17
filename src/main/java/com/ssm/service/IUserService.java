package com.ssm.service;

import com.ssm.model.Tuser;

public interface IUserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(Tuser record);
    //  用户注册
    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Integer userid);

    //用户绑定邮箱
    int updateByPrimaryKeySelective(Tuser record);
    //根据邮箱查询
    Tuser selectEmail(Tuser tuser);

    int updateByPrimaryKey(Tuser record);

    //使用用户名查询信息
    Tuser selectName(Tuser tuser);

    //用户登录 账号密码登录
    Tuser selectNamePass(Tuser tuser);

    //用户登录 手机号码登录
    Tuser selectPhone(Tuser tuser);
}