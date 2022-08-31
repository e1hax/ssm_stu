package com.ssm;

import com.ssm.config.SpringConfig;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by e1hax on 2022-08-30.
 */
public class App {
    public static void main(String[] args) {
         ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        Account account = accountService.findById(2);
        System.out.println(account);
    }
}
