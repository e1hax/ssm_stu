package com.mvc.controller;

import com.mvc.domain.Book;
import com.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by e1hax on 2022-09-02.
 */
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {

    //@RequestMapping(value = "/books",method = RequestMethod.POST)
    @PostMapping
    public String save(){
        System.out.println("book save...");
        return "{'module':'book save'}";
    }

    //@RequestMapping(value = "/books/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete..."+id);
        return "{'module':'book delete'}";
    }

    //@RequestMapping(value = "/books",method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update..."+book);
        return "{'module':'book update'}";
    }

    //@RequestMapping(value = "/books/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById..."+id);
        return "{'module':'book getById'}";
    }


    //@RequestMapping(value = "/books",method = RequestMethod.GET)
    @GetMapping
    public String getAll(){
        System.out.println("book  getAll...");
        return "{'module':'book  getAll'}";
    }
}
