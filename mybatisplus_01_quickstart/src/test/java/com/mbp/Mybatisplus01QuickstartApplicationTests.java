package com.mbp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mbp.dao.UserDao;
import com.mbp.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetById() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    void testSave(){
        User user = new User();
        user.setId(5L);
        user.setName("jack");
        user.setPassword("1111111");
        user.setAge(24);
        user.setTel("13898980909");
        userDao.insert(user);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(5L);
        user.setTel("13676767");
        userDao.updateById(user);
    }

    @Test
    void testDelete(){
        userDao.deleteById(5);
    }

    @Test
    void testLimit(){
        IPage page = new Page(1,2);
        IPage iPage = userDao.selectPage(page, null);
        System.out.println(iPage);
        System.out.println("当前页码值："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("一共多少页："+page.getPages());
        System.out.println("一共多少条数据："+page.getTotal());
        System.out.println("数据："+page.getRecords());
    }

}
