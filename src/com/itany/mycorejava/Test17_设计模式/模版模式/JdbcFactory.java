package com.itany.mycorejava.Test17_设计模式.模版模式;

import com.itany.mycorejava.Test13_jdbc.DataAccessException;
import com.itany.mycorejava.Test13_jdbc.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 黄鹏程
 * @date 2023年09月18日17:20
 */
public class JdbcFactory {
    public static <T>void modify(T t,Modify m) throws DataAccessException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = m.getSql();
            ps = conn.prepareStatement(sql);
            m.set(ps,t);
            ps.executeUpdate();
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("数据访问失败");
        } finally {
            JDBCUtil.close(conn, ps, null);
        }
    }

    public static <T> Object  select(T t,Select s) throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = s.getSql();
            ps = conn.prepareStatement(sql);
            s.set(ps,t);
            // 执行DML操作
            rs=ps.executeQuery();
            while(rs.next()){
                s.set1(t,rs);
//                user.setId(rs.getInt("id"));
//                user.setUsername(rs.getString("username"));
//                user.setPassword(rs.getString("password"));
//                user.setPhone(rs.getString("phone"));
//                user.setAddress(rs.getString("address"));
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException("数据访问失败");
        } finally {
            JDBCUtil.close(conn, ps, rs);
        }
        return t;
    }
}
