package com.mvn.service.impl;

import com.mvn.dao.BookDao;
import com.mvn.domain.Book;
import com.mvn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author e1hax
 * @date 2022-09-02
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired(required = false)
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book)>0;
    }

    public boolean update(Book book) {
        return bookDao.update(book)>0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id)>0;
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
