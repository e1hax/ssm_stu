package com.ssm.dao.impl;

import com.ssm.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * Created by e1hax on 2022-08-31.
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id,String password) {
        System.out.println("id:"+id);
        if(true) {
            throw new NullPointerException();
        }
        return "ssm";
    }
}
