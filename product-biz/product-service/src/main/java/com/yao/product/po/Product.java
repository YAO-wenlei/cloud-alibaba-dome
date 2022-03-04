package com.yao.product.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月01日 4:41 下午
 */
@TableName("product")
@Data
public class Product {
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    private String productName;
    private String productCode;
    private Integer count;
    private BigDecimal price;

}



