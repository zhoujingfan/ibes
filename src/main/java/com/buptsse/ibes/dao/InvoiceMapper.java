package com.buptsse.ibes.dao;

import com.buptsse.ibes.model.Invoice;

public interface InvoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    Invoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);
}