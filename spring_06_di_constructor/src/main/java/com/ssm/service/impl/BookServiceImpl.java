package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.dao.UserDao;
import com.ssm.service.BookService;

/**
 * Created by e1hax on 2022-08-25.
 * 构造器注入
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }


}
