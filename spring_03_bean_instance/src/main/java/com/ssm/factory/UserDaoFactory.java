package com.ssm.factory;

import com.ssm.dao.UserDao;
import com.ssm.dao.impl.UserDaoImpl;

//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
