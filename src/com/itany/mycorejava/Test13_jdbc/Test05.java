package com.itany.mycorejava.Test13_jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 黄鹏程
 * @date 2023年09月13日11:15
 */
public class Test05 {
    public static void main(String[] args) throws DataAccessException {
        Dept dept = new Dept("后勤部", "管理后勤");
        int dept_id = insertDept(dept);
        Emp emp = new Emp("admin", 3000.0, dept_id);
        Emp emp1 = new Emp("alice", 4000.0, dept_id);
        insertEmp(emp);
        insertEmp(emp1);

    }

    public static Integer insertDept(Dept dept) throws DataAccessException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Integer id = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = new StringBuffer()
                    .append("insert into ")
                    .append(" t_dept(name,remark) ")
                    .append(" values(?,?)")
                    .toString();
            ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, dept.getName());
            ps.setString(2, dept.getRemark());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw e;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(conn, ps, rs);
        }
        return id;
    }

    public static Integer insertEmp(Emp emp) throws DataAccessException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Integer id = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = new StringBuffer()
                    .append("insert into ")
                    .append(" t_emp(name,salary,dept_id) ")
                    .append(" values(?,?,?)")
                    .toString();
            ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, emp.getName());
            ps.setDouble(2, emp.getSalary());
            ps.setInt(3, emp.getDept_id());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(conn, ps, rs);
        }
        return id;
    }

}
