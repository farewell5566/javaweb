package com.xc.service;

import com.xc.pojo.User;

public interface  UserService {
    int registerUser(User user);
    public boolean login(User user);
    public boolean existUsername(String username);
}
