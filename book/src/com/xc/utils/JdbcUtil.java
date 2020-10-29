package com.xc.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil  {

    private static Connection conn = null;
    private static DruidDataSource dataSource = null;
    private static Properties properties = null;

    static{
        properties = new Properties();
        try {
            properties.load(JdbcUtil.class.getClassLoader().getResourceAsStream("application.properties"));
            //dataSource = new DruidDataSource();
            //dataSource.setConnectProperties(properties);
            try {
                dataSource =(DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection(){
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return conn;
    }
    public static void closeConnection(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
