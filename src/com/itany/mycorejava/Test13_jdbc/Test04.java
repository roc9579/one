package com.itany.mycorejava.Test13_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 黄鹏程
 * @date 2023年09月13日10:44
 */
public class Test04 {

    public static void main(String[] args) {

    }
    public static Integer insertReturnPrimaryKey(User user) throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Integer id=null;

        try {
            conn= JDBCUtil.getConnection();
            String sql=new StringBuffer()
                    .append("insert into ")
                    .append(" from t_user(username,password,phone,address)")
                    .append(" values(?,?,?,?)")
                    .toString();
            ps=conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getPhone());
            ps.setString(4,user.getAddress());
            ps.executeUpdate();
            rs=ps.getGeneratedKeys();
            while (rs.next()){
                id=rs.getInt(1);
            }

        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new DataAccessException("数据访问出错");
        }

        return id;
    }
}
