package com.itany.mycorejava.Test13_jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author 黄鹏程
 * @date 2023年09月12日16:00
 */
public class JDBCUtil {
    private static Properties p;
    static {
        p=new Properties();
        try {
            p.load(JDBCUtil.class.getClassLoader().getResourceAsStream("dataSource.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            throw  new ExceptionInInitializerError("JDBCUtil初始化失败");
        }
    }
    public static Connection getConnection() throws DataAccessException {
        try {
            Class.forName(p.getProperty("driverClassName"));
            return DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"), p.getProperty("password"));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new DataAccessException("未找到驱动");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new DataAccessException("数据访问异常");
        }
    }
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) throws DataAccessException {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DataAccessException("释放连接出错");
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                throw new DataAccessException("释放状态集出错");
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DataAccessException("释放结果集出错");
            }
        }
    }
}
