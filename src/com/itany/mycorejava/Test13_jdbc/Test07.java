package com.itany.mycorejava.Test13_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 黄鹏程
 * @date 2023年09月13日15:52
 */
public class Test07 {
    public static void main(String[] args) throws DataAccessException {
        User user=new User("jack","123456","123456456","江苏");
        insertUser(user);
    }
    public static void insertUser(User user) throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;

        try {
            conn=JDBCUtil.getConnection();
            conn.setAutoCommit(false);
            String sql=new StringBuffer()
                    .append("insert into t_user ")
                    .append("(username,password,phone,address)")
                    .append(" values ")
                    .append("   (?,?,?,?)")
                    .toString();
            ps=conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.executeUpdate();

            //int i=1/0;
            conn.commit();
        } catch (DataAccessException e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            throw e;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throw new DataAccessException();
        }
    }
}
