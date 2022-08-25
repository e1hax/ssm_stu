package com.ssm;

import com.ssm.dao.BookDao;
import com.ssm.dao.UserDao;
import com.ssm.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by e1hax on 2022-08-25.
 */
public class AppForDiSet {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) ctx.getBean("bookService");

        bookService.save();
    }
}