package com.yao.order;

import com.yao.base.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("order-service")
public interface OrderFeign {
    @GetMapping("/order/{orderNo}")
    public ResultData getOrder(@PathVariable("orderNo") String orderNo);
}
