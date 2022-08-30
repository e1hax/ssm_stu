package com.ssm.dao.impl;

import com.ssm.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * Created by e1hax on 2022-08-25.
 */
//@Component("bookDao")
    //数据层
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...2");
    }
}
