package com.xc.dao.impl;

import com.xc.dao.BaseDao;
import com.xc.dao.UserDao;
import com.xc.pojo.User;

import java.text.MessageFormat;

public class UserDaoImpl extends BaseDao implements UserDao {


    @Override
    public User queruUserByUserName(String userName) {
        String sql = "select id,username,password, email   from user where username= ? " ;
        // 不需要 String sql = "select id,username,password, email as eMail  from user where username= ? " ;
        return queryOne(User.class,sql,userName);
    }

    @Override
    public User queryUserByUserAndPassword(String userName, String password) {
        String sql = "select id,username,password,email  from user  where username=? and password=?";

        return queryOne(User.class,sql,userName,password);
    }

    @Override
    public int saveUser(User user) {
        String sql="insert into user(username,password,email) values(?,?,?)";
        return update(sql,user.getUserName(),user.getPassword(),user.geteMail());
    }
}
