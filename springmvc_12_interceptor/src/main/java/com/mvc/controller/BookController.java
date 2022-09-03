package com.mvc.controller;

import com.mvc.domain.Book;
import org.springframework.web.bind.annotation.*;

/**
 * Created by e1hax on 2022-09-02.
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(){
        System.out.println("book save...");
        return "{'module':'book save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete..."+id);
        return "{'module':'book delete'}";
    }

    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update..."+book);
        return "{'module':'book update'}";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById..."+id);
        return "{'module':'book getById'}";
    }


    @GetMapping
    public String getAll(){
        System.out.println("book  getAll...");
        return "{'module':'book  getAll'}";
    }
}
