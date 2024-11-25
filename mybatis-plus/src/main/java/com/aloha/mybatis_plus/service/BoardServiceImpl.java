package com.aloha.mybatis_plus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.mybatis_plus.dto.Board;
import com.aloha.mybatis_plus.mapper.BoardMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service    // 서비스 역할의 스프링 빈
public class BoardServiceImpl extends ServiceImpl<BoardMapper, Board> implements BoardService {
    
    @Autowired private BoardMapper boardMapper;

    


}