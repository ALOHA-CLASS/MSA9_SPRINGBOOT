package com.aloha.mybatis_plus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;

/**
 * ✅ MyBatisPlus 설정
 * 
 * MybatisPlusInterceptor
 *  : MyBatisPlus의 인터셉터로, 다양한 기능을 추가할 수 있습니다. 
 *    여기서는 페이징 기능을 추가하기 위해 사용됩니다.
 * 
 * PaginationInnerInterceptor
 *  : 페이징 처리를 위한 내부 인터셉터입니다. 
 *    이 인터셉터를 MybatisPlusInterceptor에 추가하여 페이징 기능을 활성화합니다.
 */
@Configuration
public class MyBatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 페이징 플러그인 추가
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}