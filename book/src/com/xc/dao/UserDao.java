package com.xc.dao;

import com.xc.pojo.User;

public interface UserDao {
    User queruUserByUserName(String userName);

    /** ]\
     *
     * @param userName
     * @param password
     * @return
     */
    User queryUserByUserAndPassword(String userName,String password);
    int saveUser(User user);
}
