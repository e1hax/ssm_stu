package com.jedis.test;


import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by e1hax on 2022-09-13.
 */

public class JedisDemo {
    @Test
    public void Method01(){
        //1.创建连接
        String host="127.0.0.1";
        int port = 6379;
        Jedis jedis = new Jedis(host, port);
        //2.操作redis数据库（增删改查）
            //让redis中存一个String类型的数据
        jedis.set("dance","tianelake");
        //3.释放连接
        jedis.close();
    }

    @Test
    public void method02(){
        /**
         * 连接池：管理连接的容器
         * 1).没有连接池，就会需要链接去创建，不需要就销毁，频繁的创建与销毁连接会给系统性能造成很大的复旦
         * 2).连接处的原理：初始化时就会创建一些连接在容器中，需要访问redis时从容器中获取，用完放回
         */

        //1.创建连接池
        JedisPoolConfig config = new JedisPoolConfig();
        //配置连接池
        config.setMaxIdle(5);//最大空闲连接数量
        config.setMaxTotal(10);//最大连接数量
        config.setMaxWaitMillis(2000);//最长等待时间
        String host="127.0.0.1";
        int port = 6379;
        JedisPool jedisPool = new JedisPool(host, port);
        //2.从连接池获取连接
        Jedis jedis = jedisPool.getResource();
        //3.操作redis数据库
        String dance = jedis.get("dance");
        System.out.println(dance);
        //4.放回连接池
        jedis.close();

    }


}
