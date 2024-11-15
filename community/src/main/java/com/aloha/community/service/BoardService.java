package com.aloha.community.service;

import java.util.List;

import com.aloha.community.domain.Board;

public interface BoardService {

    // 전체 목록
    public List<Board> list() throws Exception;
    // 검색
    public List<Board> list(String keyword) throws Exception;

    public Board select(String id) throws Exception;

    public int insert(Board board) throws Exception;

    public int update(Board board) throws Exception;

    public int delete(String id) throws Exception;
    
}
