package com.xc.dao;

import com.xc.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {

    private QueryRunner queryRunner= new QueryRunner();

    public int update(String sql,Object ... argus){
        Connection connection = JdbcUtil.getConnection();
        try {
            return queryRunner.update(connection,sql,argus);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeConnection();
        }
        return -1;
    }

    public <T> T queryOne(Class<T> type, String sql,Object ... argus){
        Connection connection = JdbcUtil.getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),argus);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeConnection();
        }
        return null;
    }

    public <T> List<T> queryList(Class<T> type,String sql,Object ...argus){
        Connection conn = JdbcUtil.getConnection();

        try {
            return queryRunner.query(conn,sql,new BeanListHandler<T>(type),argus);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.closeConnection();
        }
        return null;
    }

}
