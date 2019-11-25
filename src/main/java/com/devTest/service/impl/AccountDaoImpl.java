package com.devTest.service.impl;

import com.devTest.dao.IAccountDao;
import com.devTest.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  dao接口实现类（练习用，一般不写实现类）
 */
@Service
public class AccountDaoImpl implements IAccountDao {
    @Override
    public List<Account> listAll() {
        System.out.println("listAll实现方法运行..查询所有成功....");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("saveAccount实现方法运行..保存成功....");
    }
}
