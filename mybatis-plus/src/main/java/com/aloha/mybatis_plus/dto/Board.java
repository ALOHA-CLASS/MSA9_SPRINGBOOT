package com.aloha.mybatis_plus.dto;

import java.util.Date;
import java.util.UUID;

import org.apache.ibatis.type.Alias;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * Board 
 * - 게시글 정보
 */
@Data
@TableName("board")     // 테이블명         (🐦︎💙 Mybatis plus)
@Alias("Board")         // typealias 별칭   (🐦︎💗 Mybatis)
public class Board {
    @TableId(type = IdType.AUTO) // PK 설정 및 자동증가 (🐦︎💙 Mybatis plus - CRUD 에 사용)
    private int no;  
    private String id;      
    private String title;
    private String writer;
    private String content;
    private Date createdAt;
    private Date updatedAt;
    private int views;

    public Board() {
        this.id = UUID.randomUUID().toString();
    }

}
 