package com.ssm;

import com.ssm.service.impl.BookServiceImpl;

/**
 * Created by e1hax on 2022-08-24.
 */
public class App {
    public static void main(String[] args) {
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.save();
    }
}
