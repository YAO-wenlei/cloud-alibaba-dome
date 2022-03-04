package com.yao.order.config;

import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * @author yaowenlei
 * @description
 * @date 2022年02月28日 7:01 下午
 */
@Configuration
public class MybatisPlusConfig {
    //攻击sql阻断解析器
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();

        ArrayList<ISqlParser> sqlParserArrayList = new ArrayList<>();
        sqlParserArrayList.add(new BlockAttackSqlParser());

        paginationInterceptor.setSqlParserList(sqlParserArrayList);
        return paginationInterceptor;
    }

    //sql执行效率插件
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
}
