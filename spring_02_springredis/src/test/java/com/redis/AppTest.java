package com.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class AppTest {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 操作String类型数据
     */
    @Test
    public  void testString() {
        //存值
        redisTemplate.opsForValue().set("city123","beijing");

        //取值
        String value = (String) redisTemplate.opsForValue().get("city123");
        System.out.println(value);

        //存值，同时设置过期时间
        redisTemplate.opsForValue().set("key1","value1",10L, TimeUnit.SECONDS);

        //存值，如果存在则不执行任何操作
        Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent("city123", "nanjing");
        System.out.println(aBoolean);
    }

    /**
     * 操作Hash类型数据
     */
    @Test
    public  void testHash() {
        HashOperations hashOperations = redisTemplate.opsForHash();

        //存值
        hashOperations.put("002","name","xiaoming");
        hashOperations.put("002","age","18");
        hashOperations.put("002","address","beijing");

        //取值
        String age = (String) hashOperations.get("002", "age");
        System.out.println(age);

        //获得hash结构所有的字段
        Set keys = hashOperations.keys("002");
        for (Object key :keys) {
            System.out.println(key);
        }

        List values = hashOperations.values("002");
        for (Object value :values) {
            System.out.println(value);
        }
    }

    /**
     * 操作List类型的数据
     */
    @Test
    public  void testList() {
        ListOperations listOperations = redisTemplate.opsForList();

        //存值
        listOperations.leftPush("mylist","a");
        listOperations.rightPushAll("mylist","b","c","d");
        //取值
        List<String> mylist = listOperations.range("mylist", 0, -1);
        for (String value:mylist) {
            System.out.println(value);
        }


        //获取list长度
        Long size = listOperations.size("mylist");
        int lSize=size.intValue();
        for (int i = 0; i < lSize; i++) {
            //出队列
            String  element = (String) listOperations.rightPop("mylist");
            System.out.println(element);
        }
    }


    /**
     * 操作Set类型的数据
     */
    @Test
    public  void testSet() {
        SetOperations setOperations = redisTemplate.opsForSet();

        //存值,不能有相同的成员
        setOperations.add("myset","a","b","c","d","a");
        //取值
        Set<String> myset = setOperations.members("myset");
        for (String value :myset) {
            System.out.println(value);
        }

        //删除成员
        setOperations.remove("myset","b","c");

        //取值
        myset = setOperations.members("myset");
        for (String value :myset) {
            System.out.println(value);
        }
    }


    /**
     * 操作ZSet类型的数据
     */
    @Test
    public  void testZset() {
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();

        //存值
        zSetOperations.add("myZset","a",10.0);
        zSetOperations.add("myZset","b",11.0);
        zSetOperations.add("myZset","c",13.0);
        zSetOperations.add("myZset","d",12.0);

        //取值
        //Set<String> myZset = zSetOperations.range("myZset", 0, -1);
        //for (String s :myZset) {
        //    System.out.println(s);
        //}

        //修改分数
        zSetOperations.incrementScore("myZset","b",15.0);

        //取值
        //Set<String> myZset = zSetOperations.range("myZset", 0, -1);
        //for (String s :myZset) {
        //    System.out.println(s);
        //}

        //删除成员
        zSetOperations.remove("myZset","a","b");
        //取值
        Set<String> myZset = zSetOperations.range("myZset", 0, -1);
        for (String s :myZset) {
            System.out.println(s);
        }
    }


    /**
     * 通用操作，针对不同的数据类型都可以操作
     */
    @Test
    public  void testCommon() {
        //获取Redis中所有的key
        Set<String> keys = redisTemplate.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }

        //判断某个key是否存在
        Boolean itcast = redisTemplate.hasKey("itcast");
        System.out.println(itcast);

        //删除指定key
        redisTemplate.delete("myZset");

        //获取指定Key对应的value的数据类型
        DataType dataType = redisTemplate.type("myset");
        System.out.println(dataType.name());

    }
}
