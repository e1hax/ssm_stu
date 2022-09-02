package com.mvc;

import com.mvc.config.SpringConfig;
import com.mvc.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by e1hax on 2022-09-01.
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = ctx.getBean(UserController.class);
        System.out.println(bean);//SpirngConfig中无法加载UserController
    }
}
