package com.buptsse.ibes.dao;

import com.buptsse.ibes.model.InvoiceExpense;
import com.buptsse.ibes.model.InvoiceExpenseKey;

public interface InvoiceExpenseMapper {
    int deleteByPrimaryKey(InvoiceExpenseKey key);

    int insert(InvoiceExpense record);

    int insertSelective(InvoiceExpense record);

    InvoiceExpense selectByPrimaryKey(InvoiceExpenseKey key);

    int updateByPrimaryKeySelective(InvoiceExpense record);

    int updateByPrimaryKey(InvoiceExpense record);
}