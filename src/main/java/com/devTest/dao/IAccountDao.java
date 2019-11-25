package com.devTest.dao;

import com.devTest.domain.Account;

import java.util.List;

public interface IAccountDao {

    /**
     *  查询所有账户
     */
    List<Account> listAll();

    /**
     *  保存账户
     */
    void saveAccount(Account account);
}
