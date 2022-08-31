package com.ssm.config;

import org.springframework.context.annotation.*;

/**
 * Created by e1hax on 2022-08-30.
 */
@Configuration
@ComponentScan("com.ssm")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
