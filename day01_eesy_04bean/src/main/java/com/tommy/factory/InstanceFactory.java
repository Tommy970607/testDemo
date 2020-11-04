package com.tommy.factory;

import com.tommy.service.impl.AccountServiceImpl;

public class InstanceFactory {
    public AccountServiceImpl getAccountService(){
        return new AccountServiceImpl();
    }
}
