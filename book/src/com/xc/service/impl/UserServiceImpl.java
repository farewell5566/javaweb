package com.xc.service.impl;

import com.xc.dao.UserDao;
import com.xc.dao.impl.UserDaoImpl;
import com.xc.pojo.User;
import com.xc.service.UserService;

public class UserServiceImpl implements UserService {


    UserDao userDao = new UserDaoImpl();
    @Override
    public int registerUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public boolean login(User user) {
        User user1 = userDao.queryUserByUserAndPassword(user.getUserName(), user.getPassword());
        if(null == user1){
            return false;
        }else
            return true;
    }

    @Override
    public boolean existUsername(String username) {
        if(userDao.queruUserByUserName(username)!=null)
            return true;
        else
            return false;
    }
}
