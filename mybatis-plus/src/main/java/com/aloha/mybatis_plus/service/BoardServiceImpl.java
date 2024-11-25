package com.aloha.mybatis_plus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.mybatis_plus.dto.Board;
import com.aloha.mybatis_plus.mapper.BoardMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service    
public class BoardServiceImpl extends ServiceImpl<BoardMapper, Board> implements BoardService {
    
    @Autowired private BoardMapper boardMapper;

    @Override
    public Page<Board> list(int pageNo, int size) throws Exception {
        // ⭐ new Page<Board>(현재 페이지 번호, 페이지당 게시글 수)
        Page<Board> page = new Page<Board>(pageNo, size);
        // ⭐ selectPage( Page 객체, QueryWrapper(추가조건) );
        Page<Board> pageInfo = boardMapper.selectPage(page, null);
        // ⭐ pageInfo.getRecords() : 조회된 게시글 목록
        List<Board> list = pageInfo.getRecords();
        log.info("현재 페이지 번호 : {}", pageInfo.getCurrent());
        log.info("총 페이지 수 : {}", pageInfo.getPages());
        log.info("총 데이터 수 : {}", pageInfo.getTotal());
        log.info("페이당 데이터 수 : {}", pageInfo.getSize());
        log.info("list : {}", list);
        return pageInfo;
    }

    


}