package com.buptsse.ibes.dao;

import com.buptsse.ibes.model.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByUsername(String username);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}