package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by e1hax on 2022-08-30.
 */
//声明当前类为spring配置类
@Configuration
// 设置备案扫描路径
@ComponentScan("com.ssm")
public class SpringConfig {
}
