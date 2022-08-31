package com.ssm;

import com.ssm.config.SpringConfig;
import com.ssm.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by e1hax on 2022-08-31.
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        String name =  bookDao.findName(100,"password");
        System.out.println(name);
    }
}
