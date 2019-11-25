package com.devTest.dao;

import com.devTest.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAccountDao {

    /**
     *  查询所有账户
     */
    @Select("select * from account")
    List<Account> listAll();

    /**
     *  保存账户
     */
    void saveAccount(Account account);
}
