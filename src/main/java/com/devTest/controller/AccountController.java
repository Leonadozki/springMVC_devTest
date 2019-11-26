package com.devTest.controller;

import com.devTest.dao.IAccountDao;
import com.devTest.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource
    private IAccountDao accountDao;

    /**
     * @return 所有账户信息
     */
    @RequestMapping("list")
    public String listAll(Map<String, Account> map){
        List<Account> accounts = accountDao.listAll();
        for (Account account : accounts){
            map.put("msg", account);
        }
        return "success";
    }
}
