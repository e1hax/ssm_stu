package com.ssm;


import com.alibaba.druid.pool.DruidDataSource;
import com.ssm.config.SpringConfig;
import com.ssm.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Created by e1hax on 2022-08-25.
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DruidDataSource dd = ctx.getBean(DruidDataSource.class);
        System.out.println(dd);
    }
}