package com.xc.test;

import com.xc.pojo.User;
import com.xc.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    UserServiceImpl userService= new UserServiceImpl();
    @Test
    public void registerUser() {
        User user = new User();
        user.setUserName("liu");
        user.setPassword("123456");
        user.seteMail("123@123.com");
        userService.registerUser(user);
    }

    @Test
    public void login() {
        User user = new User();
        user.setUserName("liu");
        user.setPassword("123456");
        user.seteMail("123@123.com");
        if(userService.login(user)){
            System.out.println("liu 存在");
        }else
            System.out.println("liu不存在");
        User user1 = new User();
        user1.setUserName("wang");
        user1.setPassword("123456");
        user1.seteMail("123@123.com");
        if(userService.login(user1)){
            System.out.println("wang 存在");
        }else
            System.out.println("wang");

    }

    @Test
    public void existUsername() {

        if(userService.existUsername("xing")){
            System.out.println("xing 存在");
        }else
            System.out.println("xing不存在");
    }
}