package com.tommy.factory;

import com.tommy.service.impl.AccountServiceImpl;

public class StaticFactory {
    public static AccountServiceImpl getAccountService(){
        return new AccountServiceImpl();
    }
}
