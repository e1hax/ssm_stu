package com.ssm.dao.impl;

import com.ssm.dao.BookDao;

/**
 * Created by e1hax on 2022-08-25.
 */
public class BookDaoImpl implements BookDao {

    private String DatabaseName;
    private int ConnectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        DatabaseName = databaseName;
        ConnectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save..."+DatabaseName+","+ConnectionNum);
    }
}
