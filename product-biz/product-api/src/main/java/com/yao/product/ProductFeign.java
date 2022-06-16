package com.yao.product;

import com.yao.base.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-service")
public interface ProductFeign {
    @GetMapping("/product/{productCode}")
    public ResultData getProductByCode(@PathVariable("productCode") String productCode);

}
