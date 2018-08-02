package com.enterprise.demo.sys.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.enterprise.demo.api.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dubbo test
 */
@RestController
public class ConsumerController {
    @Reference(version = "1.0.0")
    private AccountService accountService;

    @RequestMapping("/consumer")
    public String getProvider() {
        return accountService.selectAccountById("");
    }
}