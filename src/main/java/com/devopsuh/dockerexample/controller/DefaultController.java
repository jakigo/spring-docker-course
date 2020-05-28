package com.devopsuh.dockerexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @Autowired
    private BookRepository books;
    @GetMapping("/books")
    public List<Book> view() {
        return books.findAll();
    }

    @PostMapping("/books")
    public Book press(Book book) {
    	return books.save(book);
    }
}
