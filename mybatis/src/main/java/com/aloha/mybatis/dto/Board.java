package com.aloha.mybatis.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 * Board 
 * - 게시글 정보
 */
@Data
@Alias("Board")
public class Board {
    private int no;        
    private String id;
    private String title;
    private String writer;
    private String content;
    private Date createdAt;
    private Date updatedAt;
    private int views;
}
 