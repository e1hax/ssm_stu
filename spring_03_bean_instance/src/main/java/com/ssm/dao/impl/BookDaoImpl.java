package com.ssm.dao.impl;

import com.ssm.dao.BookDao;

/**
 * Created by e1hax on 2022-08-24.
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
