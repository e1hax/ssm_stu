package com.ssm.factory;

import com.ssm.dao.UserDao;
import com.ssm.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

//FactoryBean创建对象
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

}
