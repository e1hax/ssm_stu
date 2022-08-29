package com.ssm;


import com.ssm.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Created by e1hax on 2022-08-25.
 */
public class App {
    public static void main(String[] args) {
        // 加载路径下配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //BookDao bookDao  = ctx.getBean(BookDao.class);
        //bookDao.save();
    }
}