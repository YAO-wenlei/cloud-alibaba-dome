package com.yao.product.service;

import com.yao.product.po.Product;

public interface ProductService {
    Product selectByCode(String productCode);
}
