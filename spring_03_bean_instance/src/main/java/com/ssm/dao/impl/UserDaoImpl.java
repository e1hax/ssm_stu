package com.ssm.dao.impl;


import com.ssm.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("user dao save ...");
    }
}
