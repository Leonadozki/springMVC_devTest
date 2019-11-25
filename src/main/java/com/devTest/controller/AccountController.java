package com.devTest.controller;

import com.devTest.service.impl.AccountDaoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource
    AccountDaoImpl accountDao;

    /**
     * @return 所有账户信息
     */
    @RequestMapping("list")
    public String listAll(){
        accountDao.listAll();
        return "success";
    }
}
