package com.aloha.sample.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {

    private String username;
    private String password;

    public User() {
        this.username = "ALOHA";
        this.password = "123456";
    }
    
    
}
