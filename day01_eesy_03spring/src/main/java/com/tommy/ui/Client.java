package com.tommy.ui;

import com.tommy.dao.IAccountDao;
import com.tommy.service.IAccountService;
import com.tommy.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

/**
 * 模拟一个表现层，用于调业务层
 */
public class Client {
    /**
     * 获取spring的IoC核心容器，并根据id获取对象
     *
     * @param args
     */
    public static void main(String[] args) {
        //1. 获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = new AccountServiceImpl();
        //  根据id获取bean对象,框架本身就有getBean（）方法来实例化组件对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        //使用字节码进行强转来获取对象
        IAccountDao adao = (IAccountDao) ac.getBean("accountDao",IAccountDao.class);
//        as.saveAccount();
        System.out.println(as);
        System.out.println(adao );


    }
}
