package com.tommy.service.impl;

import com.tommy.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    //三层架构里面业务层调用持久层


    public AccountServiceImpl(){
        System.out.println("AccountServiceImpl创建了");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了");
    }
    public void init() {
        System.out.println("对象初始化了");
    }
    public void destroy() {
        System.out.println("对象销毁了");
    }

}
