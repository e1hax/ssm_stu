package com.mvc.controller;

import com.mvc.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by e1hax on 2022-09-02.
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ==> "+ book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setType("计算机类丛书");
        book1.setName("SpringMVC终极开发");
        book1.setDescription("小试牛刀");
        books.add(book1);

        Book book2 = new Book();
        book2.setType("计算机类丛书");
        book2.setName("SpringBoot终极开发");
        book2.setDescription("享受开发");
        books.add(book2);

        return books;
    }
}
