package com.mbp;

import com.mbp.dao.UserDao;
import com.mbp.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mybatisplus03DmlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll(){
        User user = userDao.selectById(1L);
        User user2 = userDao.selectById(1L);

        user2.setName("Jock aaa");
        userDao.updateById(user2);

        user.setName("Jock bbb");
        userDao.updateById(user);
    }

}
