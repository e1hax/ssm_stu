package com.mvc.controller;

import com.mvc.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by e1hax on 2022-09-01.
 */

@Controller
public class UserController {
    //响应页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("响应页面");
        return "index.jsp";
    }

    //响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("响应文本数据");
        return "response text";
    }

    //响应POJO对象
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        User user = new User();
        user.setName("jack");
        user.setAge(10);
        System.out.println("响应pojo对象");
        return user;
    }

    //响应POJO集合对象
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User>  toJsonList(){
        User user1 = new User();
        user1.setName("tom");
        user1.setAge(12);
        User user2 = new User();
        user2.setName("jerry");
        user2.setAge(15);
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        return list;
    }


}

