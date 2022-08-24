package com.ssm;

import com.ssm.dao.BookDao;
import com.ssm.service.BookSerivce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by e1hax on 2022-08-24.
 */
public class App2 {
    public static void main(String[] args) {
        //3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取Bean
        //BookDao bookDao =(BookDao) ctx.getBean("bookDao");
        //bookDao.save();

        BookSerivce bookService = (BookSerivce) ctx.getBean("bookService");
        bookService.save();
    }
}
