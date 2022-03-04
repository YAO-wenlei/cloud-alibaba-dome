package com.yao.account.controller;

import com.yao.account.po.Account;
import com.yao.account.service.AccountService;
import com.yao.base.ResultData;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaowenlei
 * @description
 * @date 2022年02月28日 7:30 下午
 */
@RestController
@Log4j2
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account/{accountCode}")
    public ResultData getByCode(@PathVariable("accountCode")String accountCode) {
        log.info("get account details,accountCode is{}", accountCode);
        Account account = accountService.selectByCode(accountCode);
        return ResultData.success(account);
    }
}
