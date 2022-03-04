package com.yao.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yao.account.po.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    Account selectByCode(@Param("accountCode") String accountCode);

    int deleteByCode(@Param("accountCode") String accountCode);

    void increaseAmount(@Param("accountCode") String accountCode, @Param("amount") BigDecimal amount);
}
