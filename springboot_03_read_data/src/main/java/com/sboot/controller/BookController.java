package com.sboot.controller;

import com.sboot.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e1hax on 2022-09-04.
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${lesson}")
    private String lesson;

    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("-------------");
        System.out.println(lesson);
        System.out.println("-------------");
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println("-------------");
        System.out.println(enterprise);

        System.out.println("id===>" +id);
        return "hello Spring boot";
    }
}
