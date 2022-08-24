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

    //表示bean初始化操作
    public void init(){
        System.out.println("init...");
    }

    //表示bean销毁前操作
    public void destroy(){
        System.out.println("destroy...");
    }
}
