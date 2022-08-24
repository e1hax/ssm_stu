package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.service.BookSerivce;

/**
 * Created by e1hax on 2022-08-24.
 */
public class BookServiceImpl implements BookSerivce {
    //5. 删除业务层中使用new的方式创建dao对象
    private BookDao bookDao ;

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    //6. 提供对应的set方法
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }
}
