package com.ssm.factory.impl;

import com.ssm.dao.BookDao;
import com.ssm.factory.BookSerivce;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by e1hax on 2022-08-24.
 */
public class BookServiceImpl implements BookSerivce, InitializingBean, DisposableBean {
    //5. 删除业务层中使用new的方式创建dao对象
    private BookDao bookDao ;

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    //6. 提供对应的set方法
    public void setBookDao(BookDao bookDao){
        System.out.println("set....");
        this.bookDao=bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");

    }
}
