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

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }


}
