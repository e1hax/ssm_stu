package com.ssm.dao.impl;

import com.ssm.dao.BookDao;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by e1hax on 2022-08-25.
 */
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
