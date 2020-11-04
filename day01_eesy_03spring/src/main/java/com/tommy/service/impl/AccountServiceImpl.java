package com.tommy.service.impl;

import com.tommy.dao.IAccountDao;
import com.tommy.dao.impl.AccountImpl;
import com.tommy.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    //三层架构里面业务层调用持久层

    private IAccountDao accountDao = new AccountImpl();

    public AccountServiceImpl(){
        System.out.println("创建了");
    }

    public void saveAccount() {
        accountDao.saveAccount();

    }

}
