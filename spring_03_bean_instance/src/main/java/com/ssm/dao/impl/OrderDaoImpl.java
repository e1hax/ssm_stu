package com.ssm.dao.impl;


import com.ssm.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {

    @Override
    public void save() {
        System.out.println("order dao save ...");
    }
}
