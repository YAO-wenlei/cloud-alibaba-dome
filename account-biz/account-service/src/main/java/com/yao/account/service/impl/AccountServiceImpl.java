package com.yao.account.service.impl;

import com.yao.account.mapper.AccountMapper;
import com.yao.account.po.Account;
import com.yao.account.service.AccountService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author yaowenlei
 * @description
 * @date 2022年02月28日 7:22 下午
 */
@Service
@Log4j2
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account selectByCode(String accountCode) {
        return accountMapper.selectByCode(accountCode);
    }

    @Override
    public int deleteByCode(String accountCode) {
        return accountMapper.deleteByCode(accountCode);
    }

    @Override
    public void increaseAmount(String accountCode,BigDecimal amount) {
        accountMapper.increaseAmount(accountCode,amount);
    }
}
