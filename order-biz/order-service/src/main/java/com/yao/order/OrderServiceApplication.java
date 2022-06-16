package com.yao.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yaowenlei
 * @description
 * @date 2022年02月28日 6:12 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yao.order.mapper")
@EnableFeignClients(basePackages = {"com.yao.*"})
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class,args);
    }
}
