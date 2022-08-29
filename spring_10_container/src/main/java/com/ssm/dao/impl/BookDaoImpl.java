package com.ssm.dao.impl;

import com.ssm.dao.BookDao;

import java.util.*;

/**
 * Created by e1hax on 2022-08-25.
 */
public class BookDaoImpl implements BookDao {

    public BookDaoImpl(){
        System.out.println("constructor");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
