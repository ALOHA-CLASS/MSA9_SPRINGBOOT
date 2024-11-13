package com.aloha.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aloha.sample.domain.User;


@RestController
public class TestRestController {

    @Autowired
    private User user;

    @GetMapping("/user")
    public User user() {
        return user;
    }
    
}
