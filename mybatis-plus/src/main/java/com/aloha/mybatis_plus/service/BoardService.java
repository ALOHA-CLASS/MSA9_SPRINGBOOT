package com.aloha.mybatis_plus.service;

import com.aloha.mybatis_plus.dto.Board;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface BoardService  {

    // ⭐ 페이징
    public Page<Board> list(int pageNo, int size) throws Exception;
    
}