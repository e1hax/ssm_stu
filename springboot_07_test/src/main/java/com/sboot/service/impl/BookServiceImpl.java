package com.sboot.service.impl;

import com.sboot.service.BookService;
import org.springframework.stereotype.Service;

/**
 * Created by e1hax on 2022-09-04.
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("Book Service is running...");
    }
}
