package com.yao.order.serivce.impl;

import com.yao.order.mapper.OrderMapper;
import com.yao.order.po.Order;
import com.yao.order.serivce.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月04日 2:23 下午
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public Order getByNo(String orderNo) {
        return orderMapper.selectByNo(orderNo);
    }
}
