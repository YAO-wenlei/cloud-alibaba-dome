package com.yao.order.controller;

import com.yao.base.ResultData;
import com.yao.order.po.Order;
import com.yao.order.serivce.OrderService;
import com.yao.product.ProductFeign;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月01日 3:49 下午
 */
@RestController
@Log4j2
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    ProductFeign productFeign;

    @GetMapping("/order/{orderNo}")
    public ResultData getOrder(@PathVariable("orderNo")String orderNo){
        Order order = orderService.getByNo(orderNo);
        return ResultData.success(order);
    }

}
