package com.ssm.config;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ssm")
@EnableAspectJAutoProxy
public class SpringConfig {
}
