package com.ssm.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.ssm.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import javax.sql.DataSource;

/**
 * Created by e1hax on 2022-08-30.
 */
//@Configuration
    @PropertySource("jdbc.properties")
public class JdbcConfig {

    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String passWord;

    //1. 定义一一个方法获得要管理的对象
    //2. 添加@bean，表示当前方法返回值是一个bean
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(passWord);
        return ds;
    }
}
