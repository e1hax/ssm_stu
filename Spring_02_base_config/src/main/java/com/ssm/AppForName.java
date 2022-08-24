package com.ssm;

import com.ssm.service.BookSerivce;
import com.ssm.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by e1hax on 2022-08-24.
 */
public class AppForName {
    public static void main(String[] args) {
        // 获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取Bean
        BookSerivce bookService = (BookSerivce) ctx.getBean("service");
        bookService.save();
    }
}
