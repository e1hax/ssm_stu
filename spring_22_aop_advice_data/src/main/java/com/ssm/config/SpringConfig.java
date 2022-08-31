package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by e1hax on 2022-08-31.
 */
@Component
@ComponentScan("com.ssm")
@EnableAspectJAutoProxy
public class SpringConfig {
}
