package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by e1hax on 2022-08-31.
 */
@Configuration
@ComponentScan("com.ssm")
@EnableAspectJAutoProxy
public class SpringConfig {
}
