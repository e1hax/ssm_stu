package com.mbp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mbp.dao.UserDao;
import com.mbp.domain.User;
import com.mbp.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    ////方式一
    //@Test
    //void testGetAll() {
    //    QueryWrapper  qw = new QueryWrapper ();
    //    qw.lt("age",10);
    //    List<User> users = userDao.selectList(qw);
    //    System.out.println(users);
    //}

    ////方式二
    //@Test
    //void testGetAll() {
    //    QueryWrapper<User> qw = new QueryWrapper<User>();
    //    qw.lambda().lt(User::getAge,10);
    //    List<User> users = userDao.selectList(qw);
    //    System.out.println(users);
    //}


    //方式三
    //@Test
    //void testGetAll() {
    //    LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
    //    lqw.lt(User::getAge,10);
    //    List<User> users = userDao.selectList(lqw);
    //    System.out.println(users);
    //}

    //多条件查询
    //@Test
    //void testGetAll() {
    //    LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
    //    lqw.lt(User::getAge,12).ge(User::getAge,5);
    //    List<User> users = userDao.selectList(lqw);
    //    System.out.println(users);
    //}

    //多条件查询
    //@Test
    //void testGetAll() {
    //    LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
    //    lqw.gt(User::getAge,12).or().le(User::getAge,5);
    //    List<User> users = userDao.selectList(lqw);
    //    System.out.println(users);
    //}
    @Test
    void testGetAll() {

        UserQuery uq = new UserQuery();
        uq.setAge(10);
        uq.setAge2(30);

        //null判断
        //LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        //lqw.lt(User::getAge, uq.getAge2());
        //if (null!=uq.getAge2()) {
        //    lqw.gt(User::getAge,uq.getAge());
        //}
        //List<User> users = userDao.selectList(lqw);
        //System.out.println(users);

        //LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        //lqw.lt(null != uq.getAge2(), User::getAge, uq.getAge2())
        //        .gt(null != uq.getAge(), User::getAge, uq.getAge());

        //lqw.lt(null != uq.getAge2(), User::getAge, uq.getAge2());
        //lqw.gt(null != uq.getAge(), User::getAge, uq.getAge());
        //List<User> users = userDao.selectList(lqw);
        //System.out.println(users);

        //查询投影
        //LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        //lqw.select(User::getAge,User::getName,User::getTel);
        ////QueryWrapper<User> lqw = new QueryWrapper<>();
        ////lqw.select("id","name","age","tel");
        //List<User> userList = userDao.selectList(lqw);
        //System.out.println(userList);

        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.select("count(*) as count ,tel");
        qw.groupBy("tel");
        List<Map<String, Object>> maps = userDao.selectMaps(qw);
        System.out.println(maps);
    }
}
