package com.yao.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yao.order.po.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月01日 2:03 下午
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    //根据订单编码获取订单
    Order selectByNo(@Param("orderNo")String orderNo);

    //

}
