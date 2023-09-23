package com.itany.mycorejava.Test13_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 黄鹏程
 * @date 2023年09月13日16:22
 */
public class Test08 {
    public static void test01() throws SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn=JDBCUtil.getConnection();
            conn.setAutoCommit(false);
            String sql = new StringBuffer()
                    .append(" insert into ")
                    .append(" t_user ")
                    .append("   (username,password,phone,address)")
                    .append(" values ")
                    .append("   (?,?,?,?)")
                    .toString();
            long begin=System.currentTimeMillis();
            ps=conn.prepareStatement(sql);
            for (int i=1;i<1000;i++){
                ps.setString(1, "test");
                ps.setString(2, "123456");
                ps.setString(3, "13812345678");
                ps.setString(4, "江苏-南京");
                ps.addBatch();
            }
            ps.executeBatch();
            conn.commit();
            long end=System.currentTimeMillis();
            System.out.println(end-begin);
        } catch (DataAccessException e) {
            e.printStackTrace();
            conn.rollback();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            conn.rollback();
        }
    }
}
