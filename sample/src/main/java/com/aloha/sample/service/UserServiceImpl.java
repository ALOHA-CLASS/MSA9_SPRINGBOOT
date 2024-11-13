package com.aloha.sample.service;

import org.springframework.stereotype.Service;

import com.aloha.sample.domain.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void test(User user) throws Exception {
        log.info("UserServceImpl - test()");
    }
    
}
