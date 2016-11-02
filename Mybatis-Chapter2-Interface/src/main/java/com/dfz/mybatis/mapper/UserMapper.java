package com.dfz.mybatis.mapper;

import com.dfz.mybatis.model.User;

/**
 * Created by zhangsiyuan on 2016/11/2.
 */
public interface UserMapper {
    public User selectUserByID(int id);
}
