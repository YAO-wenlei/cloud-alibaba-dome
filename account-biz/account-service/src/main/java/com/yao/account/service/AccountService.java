package com.yao.account.service;

import com.yao.account.po.Account;

import java.math.BigDecimal;

public interface AccountService {
    Account selectByCode(String accountCode);

    int deleteByCode(String accountCode);

    void increaseAmount(String accountCode,BigDecimal amount);
}
