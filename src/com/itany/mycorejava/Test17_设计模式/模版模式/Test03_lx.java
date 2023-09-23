package com.itany.mycorejava.Test17_设计模式.模版模式;

import com.itany.mycorejava.Test13_jdbc.DataAccessException;
import com.itany.mycorejava.Test13_jdbc.User ;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 黄鹏程
 * @date 2023年09月18日18:01
 */
public class Test03_lx {
    public static void main(String[] args) throws DataAccessException {
        User user=new User();
        JdbcFactory.modify(user, new Modify() {
            @Override
            public String getSql() {
                return new StringBuffer()
                        .append(" insert into ")
                        .append(" t_user")
                        .append("   (username,password,phone,address)")
                        .append(" values")
                        .append("   (?,?,?,?)")
                        .toString();
            }

            @Override
            public void set(PreparedStatement ps,Object o) {
                try {
                    User user1= (User) o;
                    ps.setString(1, user1.getUsername());
                    ps.setString(2, user1.getPassword());
                    ps.setString(3, user1.getPhone());
                    ps.setString(4, user1.getAddress());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });

        JdbcFactory.modify(1, new Modify() {
            @Override
            public String getSql() {
                return new StringBuffer()
                        .append(" delete from ")
                        .append(" t_user")
                        .append("  where id=")
                        .append("?")
                        .toString();
            }

            @Override
            public void set(PreparedStatement ps, Object o) throws SQLException {
                ps.setInt(1, (Integer) o);
            }
        });
    }
}
