package com.yao.account;

import com.yao.base.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yaowenlei
 * @description
 * @date 2022年03月03日 10:33 上午
 */
@FeignClient("account-service")
public interface AccountFeign {
    @GetMapping("/account/{accountCode}")
    ResultData getByCode(@PathVariable("accountCode")String accountCode);
}
