package com.mvn.service;

import com.mvn.config.SpringConfig;
import com.mvn.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by e1hax on 2022-09-02.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = SpringConfig.class)
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
