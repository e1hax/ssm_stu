package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by e1hax on 2022-08-31.
 */
@Configuration
@ComponentScan("com.ssm")
@PropertySource("classpath:jdbc.properties")
//注意加载配置文件顺序
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
