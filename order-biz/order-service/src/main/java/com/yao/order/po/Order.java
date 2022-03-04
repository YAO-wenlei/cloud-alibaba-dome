package com.yao.order.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月01日 2:16 下午
 */
@TableName("order")
@Data
public class Order {
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer id;
    private String orderNo;
    private String accountCode;
    private String productCode;
    private Integer count;
    private BigDecimal amount;
}
