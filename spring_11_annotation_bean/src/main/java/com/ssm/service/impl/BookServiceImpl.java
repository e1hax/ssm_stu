package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.service.BookService;
import org.springframework.stereotype.Service;

/**
 * Created by e1hax on 2022-08-30.
 */
@Service
//服务层
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
