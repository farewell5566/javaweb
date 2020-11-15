package com.xc.test;

import com.xc.dao.impl.UserDaoImpl;
import com.xc.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    UserDaoImpl userImpl = new UserDaoImpl();
    @Test
    public void queruUserByUserName() {
        User user =userImpl.queruUserByUserName("zhangsan");
        System.out.println(user);
    }

    @Test
    public void queryUserByUserAndPassword() {
        User user = userImpl.queryUserByUserAndPassword("zhangsan","123456");
        System.out.println(user);
    }

    @Test
    public void saveUser() {
        User user =new User();
        user.setPassword("123456");
        user.seteMail("123@123.com");
        user.setUserName("xing");
        userImpl.saveUser(user);
    }
}