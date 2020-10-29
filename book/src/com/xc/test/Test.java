package com.xc.test;

import com.xc.utils.JdbcUtil;

import java.sql.Connection;

public class Test {

    @org.junit.Test
    public void TestForConnection(){
        Connection connection = JdbcUtil.getConnection();
        System.out.println(connection);
    }

}
