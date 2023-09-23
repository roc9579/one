package com.itany.mycorejava.Test13_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月12日10:26
 */
public class Test01 {
    public static void main(String[] args) {
//        User user = new User("jack", "123456", "13912345678", "江苏-南京");
//        insertUser(user);
//        User user=new User(1,"tom","123455","13243352","江苏-苏州");
//        updateUser(user);
//        deleteById(3);
//        User user=selectById(1);
//        System.out.println(user.toString());
        System.out.println(login("tom","123455"));
    }

    public static List<User> login(String username, String password){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<User> users=new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "mmmm");
            String sql="select * from t_user where username= ? and password= ? ";
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    public static void updateUser(User user){
        Connection conn=null;
        Statement st=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "mmmm");
            st=conn.createStatement();
            String sql="update t_user set username='" + user.getUsername() + "',password='"+user.getPassword()+"',phone='"+user.getPhone()+"',address='"+user.getAddress()+"' where id="+user.getId()+"";
            int row=st.executeUpdate(sql);
            System.out.println("Query ok," + row + " rows affected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("释放资源出错");
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("释放资源出错");
                }
            }
        }
    }

    public static void deleteById(Integer id){
        Connection conn=null;
        Statement st=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "mmmm");
            st=conn.createStatement();
            String sql="delete from t_user where id="+id+"";
            int row=st.executeUpdate(sql);
            System.out.println("Query ok," + row + " rows affected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("释放资源出错");
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("释放资源出错");
                }
            }
        }
    }

    public static User selectById(Integer id){
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        User user=new User();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "mmmm");
            st= conn.createStatement();
            String sql="select id,username,password,phone,address from t_user where id="+id+"";
            rs=st.executeQuery(sql);
            while (rs.next()){
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            // 6.释放资源
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        // 将映射完成的对象集合返回
        return user;
    }

    public static List<User> selectAll() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 2.获取连接
            // 在Java访问数据库的时候,可能会产生乱码
            // 为了解决JDBC导致的乱码,需要在url地址末尾添加一个后缀
            // ?useUnicode=true&characterEncoding=utf-8
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8", "root", "");

            // 3.获取状态集
            st = conn.createStatement();

            // 4.执行sql
            String sql = "select id,username,password,phone,address from t_user";
            // 执行查询操作
            rs = st.executeQuery(sql);

            // 5.处理结果集
            // 将数据库查询的结果集映射成Java对象
            // 查询的结果集中的每一行数据映射成一个Java对象
            // executeQuery方法的返回值ResultSet表示数据库的结果集
            // 在映射时,根据ResultSet提供的next方法判断是否有下一行数据
            // 返回值为true表示有数据,则需要映射
            // 返回值为false表示没有数据,则不需要映射
            while (rs.next()) {
                // 只要结果集中有尚未映射的数据,则需要映射成对象
                // 每次读取一行,映射一个Java对象
                User user = new User();
                // 将结果集中的列的数据映射成Java对象属性的值
                // 在ResultSet中提供了获取列的数据的方法
                // getXxxx(int columIndex):获取第几列的数据,参数表示第几列
                // 其值从1开始
                user.setId(rs.getInt(1));
                // 开发中字段可能会比较多,如果使用第几列的方式进行获取的话可能比较混乱
                // 因此,建议使用指定列名的方式进行获取
                // getXxx(String columnLabel):获取哪一列的数据,参数表示列名
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));

                // 此时映射完成之后只是映射了一个对象
                // 但是结果集中可能包含无数行数据,每一行数据都需要映射成一个Java对象
                // 因此,可以通过一个对象集合来接收这些对象
                // 每映射一次,生成一个Java对象,添加到对应的对象集合中
                users.add(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("找不到驱动");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("数据库访问失败");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.err.println("释放资源出错");
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.err.println("释放资源出错");
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.err.println("释放资源出错");
                }
            }
        }
        return users;
    }


    public static void insertUser(User user){
        Connection conn=null;
        Statement st=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?useSSL=false", "root", "mmmm");
            st = conn.createStatement();
            String sql = "insert into t_user(username,password,phone,address) values('" + user.getUsername() + "','" + user.getPassword() + "','" + user.getPhone() + "','" + user.getAddress() + "')";
            int row = st.executeUpdate(sql);
            System.out.println("Query Ok,"+row+" rows affected");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("释放资源出错");
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("释放资源出错");
                }
            }
        }
    }
}
