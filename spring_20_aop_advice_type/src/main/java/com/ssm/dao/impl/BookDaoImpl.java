package com.ssm.dao.impl;

import com.ssm.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void update(){
        System.out.println("book dao update is running...");
    }


    @Override
    public int select(){
        System.out.println("book dao select is running...");
        //int i = 1/0;
        return 100;
    }
}
