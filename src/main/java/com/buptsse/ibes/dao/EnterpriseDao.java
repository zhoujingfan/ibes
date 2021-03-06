package com.buptsse.ibes.dao;

import com.buptsse.ibes.model.Enterprise;

public interface EnterpriseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}