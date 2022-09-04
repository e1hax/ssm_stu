package com.sboot.service;


import com.sboot.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created by e1hax on 2022-09-02.
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book byId = bookService.getById(1);
        System.out.println(byId);
    }

    @Test
    public void testGetAll( ){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
