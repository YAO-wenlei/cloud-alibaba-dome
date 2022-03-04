package com.yao.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yao.product.mapper.ProductMapper;
import com.yao.product.po.Product;
import com.yao.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月01日 5:27 下午
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public Product selectByCode(String productCode) {
        LambdaQueryWrapper<Product> eq = new LambdaQueryWrapper<Product>().eq(Product::getProductCode, productCode);
        Product product = productMapper.selectOne(eq);
        return product;
    }
}
