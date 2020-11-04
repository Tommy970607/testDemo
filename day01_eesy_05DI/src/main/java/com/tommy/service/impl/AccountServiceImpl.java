package com.tommy.service.impl;

import com.tommy.service.IAccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    //三层架构里面业务层调用持久层
    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了");
        System.out.println(this.name+"----"+this.age+"----"+this.birthday);
    }

}
