package com.mvc.service.impl;

import com.mvc.controller.Code;
import com.mvc.dao.BookDao;
import com.mvc.domain.Book;
import com.mvc.exception.BusinessException;
import com.mvc.exception.SystemException;
import com.mvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by e1hax on 2022-09-02.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
        //模拟业务异常
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR,"非法参数，警告！");
        }
        //模拟系统异常
        try {
            int i=1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问尝试，请稍后重试！",e);
        }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
