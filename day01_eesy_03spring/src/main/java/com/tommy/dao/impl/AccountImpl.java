package com.tommy.dao.impl;

import com.tommy.dao.IAccountDao;

/**
 * 账户的持久层实现类
 */

public class AccountImpl implements IAccountDao {

    public void saveAccount(){
        System.out.println("保存了账户");

    }
}
