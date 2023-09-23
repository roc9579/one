package com.itany.mycorejava.Test13_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月12日16:19
 */
public class Test03_单表操作 {
    public static void main(String[] args) throws DataAccessException {
//        User user = new User("jack","111111","13912345678","江苏-苏州");
//        insertUser(user);
//        deleteById(4);
//        System.out.println(selectById(1));
//        System.out.println(selectAll());
    }

    public static void insertUser(User user) throws DataAccessException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = JDBCUtil.getConnection();

            // String sql = "insert into t_user(username,password,phone,address) values(?,?,?,?)";
            // 开发中由于SQL过长,导致可读性会降低
            // 一般可以使用StringBuffer来进行字符串拼接
            // 提高代码的可读性
            String sql = new StringBuffer()
                    .append(" insert into ")
                    .append(" t_user")
                    .append("   (username,password,phone,address)")
                    .append(" values")
                    .append("   (?,?,?,?)")
                    .toString();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            // 执行DML操作
            ps.executeUpdate();
            System.out.println("添加成功");
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

    public static void deleteById(Integer id) throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn = JDBCUtil.getConnection();

            // String sql = "insert into t_user(username,password,phone,address) values(?,?,?,?)";
            // 开发中由于SQL过长,导致可读性会降低
            // 一般可以使用StringBuffer来进行字符串拼接
            // 提高代码的可读性
            String sql = new StringBuffer()
                    .append(" delete from ")
                    .append(" t_user")
                    .append("  where id=")
                    .append("?")
                    .toString();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            // 执行DML操作
            ps.executeUpdate();
            System.out.println("删除成功");
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

    public static void updateUser(User user) throws DataAccessException {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = JDBCUtil.getConnection();

            // String sql = "insert into t_user(username,password,phone,address) values(?,?,?,?)";
            // 开发中由于SQL过长,导致可读性会降低
            // 一般可以使用StringBuffer来进行字符串拼接
            // 提高代码的可读性
            String sql = new StringBuffer()
                    .append(" update  ")
                    .append(" t_user")
                    .append("  set username=")
                    .append(" ?,")
                    .append(" password=")
                    .append(" ?,")
                    .append(" phone=")
                    .append(" ?,")
                    .append(" address=")
                    .append(" ?")
                    .append("  where id=")
                    .append("?")
                    .toString();
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setInt(5, user.getId());
            // 执行DML操作
            ps.executeUpdate();
            System.out.println("修改成功");
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

    public static User selectById(Integer id) throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        User user=new User();
        try {
            conn = JDBCUtil.getConnection();

            // String sql = "insert into t_user(username,password,phone,address) values(?,?,?,?)";
            // 开发中由于SQL过长,导致可读性会降低
            // 一般可以使用StringBuffer来进行字符串拼接
            // 提高代码的可读性
            String sql = new StringBuffer()
                    .append(" select * from ")
                    .append(" t_user")
                    .append("  where id=")
                    .append("?")
                    .toString();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            // 执行DML操作
            rs=ps.executeQuery();
            while(rs.next()){
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
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
        return user;
    }

    public static List<User> selectAll() throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<User> users=new ArrayList<>();
        try {
            conn = JDBCUtil.getConnection();

            // String sql = "insert into t_user(username,password,phone,address) values(?,?,?,?)";
            // 开发中由于SQL过长,导致可读性会降低
            // 一般可以使用StringBuffer来进行字符串拼接
            // 提高代码的可读性
            String sql = new StringBuffer()
                    .append(" select * from ")
                    .append(" t_user")
                    .toString();
            ps = conn.prepareStatement(sql);
            // 执行DML操作
            rs=ps.executeQuery();
            while(rs.next()){
                User user=new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                users.add(user);
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
        return users;
    }

}
