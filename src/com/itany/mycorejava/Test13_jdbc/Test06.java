package com.itany.mycorejava.Test13_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月13日14:13
 */
public class Test06 {
    public static void main(String[] args) throws DataAccessException {
        System.out.println(selectById(1));
    }


    public static List<Emp> selectAll() throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Emp> emps=new ArrayList<>();
        try {
            conn=JDBCUtil.getConnection();
            String sql=new StringBuffer()
                    .append("select e.id,e.name,e.salary,e.dept_id,d.id 'd.id',d.name 'd.name',d.remark ")
                    .append(" from t_emp e ")
                    .append(" left join t_dept d ")
                    .append("  on e.dept_id=d.id")
                    .toString();
            ps= conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Dept dept=new Dept();
                dept.setId(rs.getInt("d.id"));
                dept.setName(rs.getString("d.name"));
                dept.setRemark(rs.getString("remark"));

                Emp emp=new Emp();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setDept_id(rs.getInt("dept_id"));
                emp.setDept(dept);
                emps.add(emp);
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtil.close(conn,ps,rs);
        }
        return emps;
    }

    public static Dept selectById(Integer id){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Dept dept=null;
        try {
            conn=JDBCUtil.getConnection();
            String sql=new StringBuffer()
                    .append("select d.id,d.name,d.remark,e.id 'e.id',e.name 'e.name',e.salary,e.dept_id ")
                    .append(" from t_dept d ")
                    .append(" left join t_emp e ")
                    .append("  on d.id=e.dept_id ")
                    .append(" where d.id= ? ")
                    .toString();
            ps= conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            while (rs.next()){
                if (dept==null){
                    dept=new Dept();
                    dept.setId(rs.getInt("id"));
                    dept.setName(rs.getString("name"));
                    dept.setRemark(rs.getString("remark"));
                }
                Emp emp=new Emp();
                emp.setId(rs.getInt("e.id"));
                emp.setName(rs.getString("e.name"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setDept_id(rs.getInt("dept_id"));
                dept.addEmp(emp);
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return dept;
    }
}
