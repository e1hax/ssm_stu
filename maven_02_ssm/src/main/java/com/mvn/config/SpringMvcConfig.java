package com.mvn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by e1hax on 2022-09-02.
 */
@Configuration
@ComponentScan({"com.mvn.controller", "com.mvn.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
