package com.yao.account.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.lang.annotation.Inherited;
import java.math.BigDecimal;

/**
 * @author yaowenlei
 * @description
 * @date 2022年02月28日 6:57 下午
 */
@Data
@TableName("account")
public class Account {
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer id;
    private String accountCode;
    private String accountName;
    private BigDecimal amount;
}
