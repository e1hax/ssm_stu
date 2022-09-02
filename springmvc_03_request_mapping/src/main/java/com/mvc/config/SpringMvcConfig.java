package com.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by e1hax on 2022-09-01.
 */
// 3. 创建springmvc配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.mvc.controller")
public class SpringMvcConfig {
}
