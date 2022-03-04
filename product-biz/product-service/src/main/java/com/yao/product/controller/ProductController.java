package com.yao.product.controller;

import com.yao.account.AccountFeign;
import com.yao.base.ResultData;
import com.yao.product.po.Product;
import com.yao.product.service.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月01日 5:32 下午
 */
@RestController
@Log4j2
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    AccountFeign accountFeign;

    @GetMapping("/product/{productCode}")
    public ResultData getProductByCode(@PathVariable("productCode") String productCode) {
        log.info("get product by productCode {}",productCode);
        Product product = productService.selectByCode(productCode);
        return ResultData.success(product);
    }

    @GetMapping("account/{accountCode}")
    public ResultData getAccount(@PathVariable("accountCode") String accountCode){
        ResultData account = accountFeign.getByCode(accountCode);
        return ResultData.success(account);
    }
}
