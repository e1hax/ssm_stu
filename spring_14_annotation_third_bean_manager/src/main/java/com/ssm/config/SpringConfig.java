package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * Created by e1hax on 2022-08-30.
 */
//声明当前类为spring配置类
@Configuration
// 设置备案扫描路径
@ComponentScan( "com.ssm" )
//导入配置类
@Import(JdbcConfig.class)
public class SpringConfig {
}
