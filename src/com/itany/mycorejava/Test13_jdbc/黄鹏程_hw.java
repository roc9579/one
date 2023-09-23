//package com.itany.mycorejava.Test13_jdbc;
//
//import com.itany.mycorejava.util.ParameterUtil;
//
//import javax.swing.plaf.synth.SynthEditorPaneUI;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * @author 黄鹏程
// * @date 2023年09月12日17:14
// */
//// 创建一张学生表,拥有以下字段:主键id、学号no唯一且不为空、姓名不为空、年龄
////    create table t_stu(
////            id int primary key auto_increment,
////            no int not null unique,
////            name varchar(100) not null,
////            age int
////            );
//// 完成以下方法
//public class 黄鹏程_hw {
//    public static void main(String[] args) throws DataAccessException {
////        Student student=new Student(2021,"tom",18);
////        insertStudent(student);
////        deleteStudent(2021);
////        Student student=new Student(2019,"jack",19);
////        updateStudent(student);
////        System.out.println(selectAll());
////        System.out.println(selectByNo(2019));
////        System.out.println(selectByName("ja"));
////        System.out.println(selectByAge(18,19));
//        Scanner sc=new Scanner(System.in);
//        System.out.print("请输入查询第几页的数据");
//        int pageNo= sc.nextInt();
//        System.out.print("请输入每页显示多少数据");
//        int pageSize= sc.nextInt();
//        System.out.println(selectByPage(pageNo, pageSize));
//    }
//
//    public static List<Student> selectByPage(Integer pageNo,Integer pageSize) throws DataAccessException {
//        Connection conn=null;
//        PreparedStatement ps=null;
//        ResultSet rs=null;
//        List<Student> students=new ArrayList<>();
//        try {
//            conn=JDBCUtil.getConnection();
//            String sql=new StringBuffer()
//                    .append("select * from ")
//                    .append(" t_stu ")
//                    .append(" limit ?,?")
//                    .toString();
//            ps=conn.prepareStatement(sql);
//            ps.setInt(1,(pageNo-1)*pageSize);
//            ps.setInt(2,pageSize);
//            rs=ps.executeQuery();
//            while (rs.next()){
//                Student student=new Student();
//                student.setId(rs.getInt("id"));
//                student.setNo(rs.getInt("no"));
//                student.setName(rs.getString("name"));
//                student.setAge(rs.getInt("age"));
//                students.add(student);
//            }
//        } catch (DataAccessException e) {
//            e.printStackTrace();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        } finally {
//            JDBCUtil.close(conn,ps,rs);
//        }
//        return students;
//    }
//
//
//
//    // 1.添加学生信息
//    public static void insertStudent(Student student) throws DataAccessException {
//        Connection conn = null;
//        PreparedStatement ps = null;
//        try {
//            conn = JDBCUtil.getConnection();
//            String sql = new StringBuffer()
//                    .append(" insert into ")
//                    .append(" t_stu")
//                    .append("   (no,name,age)")
//                    .append(" values")
//                    .append("   (?,?,?)")
//                    .toString();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, student.getNo());
//            ps.setString(2, student.getName());
//            ps.setInt(3, student.getAge());
//            ps.executeUpdate();
//            System.out.println("添加成功");
//        } catch (DataAccessException e) {
//            e.printStackTrace();
//            throw e;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new DataAccessException("数据访问失败");
//        } finally {
//            JDBCUtil.close(conn, ps, null);
//        }
//    }
//    // 2.根据学号删除指定学生信息
//    public static void deleteStudent(Integer no) throws DataAccessException {
//        Connection conn=null;
//        PreparedStatement ps=null;
//        try {
//            conn = JDBCUtil.getConnection();
//            String sql = new StringBuffer()
//                    .append(" delete from ")
//                    .append(" t_stu")
//                    .append("  where no=")
//                    .append("?")
//                    .toString();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, no);
//            ps.executeUpdate();
//            System.out.println("删除成功");
//        } catch (DataAccessException e) {
//            e.printStackTrace();
//            throw e;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new DataAccessException("数据访问失败");
//        } finally {
//            JDBCUtil.close(conn, ps, null);
//        }
//    }
//    // 3.根据学号修改指定学生信息
//    public static void updateStudent(Student student) throws DataAccessException {
//        Connection conn = null;
//        PreparedStatement ps = null;
//        try {
//            conn = JDBCUtil.getConnection();
//            String sql = new StringBuffer()
//                    .append(" update  ")
//                    .append(" t_stu")
//                    .append("  set no=")
//                    .append(" ?,")
//                    .append(" name=")
//                    .append(" ?,")
//                    .append(" age=")
//                    .append(" ?")
//                    .append("  where no=")
//                    .append("?")
//                    .toString();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1,student.getNo());
//            ps.setString(2, student.getName());
//            ps.setInt(3, student.getAge());
//            ps.setInt(4, student.getNo());
//            ps.executeUpdate();
//            System.out.println("修改成功");
//        } catch (DataAccessException e) {
//            e.printStackTrace();
//            throw e;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new DataAccessException("数据访问失败");
//        } finally {
//            JDBCUtil.close(conn, ps, null);
//        }
//    }
//    // 4.查询所有学生信息
//    public static List<Student> selectAll() throws DataAccessException {
//        Connection conn=null;
//        PreparedStatement ps=null;
//        ResultSet rs=null;
//        List<Student> students=new ArrayList<>();
//        try {
//            conn = JDBCUtil.getConnection();
//            String sql = new StringBuffer()
//                    .append(" select * from ")
//                    .append(" t_stu")
//                    .toString();
//            ps = conn.prepareStatement(sql);
//            rs=ps.executeQuery();
//            while(rs.next()){
//                Student student=new Student();
//                student.setId(rs.getInt("id"));
//                student.setNo(rs.getInt("no"));
//                student.setName(rs.getString("name"));
//                student.setAge(rs.getInt("age"));
//                students.add(student);
//            }
//        } catch (DataAccessException e) {
//            e.printStackTrace();
//            throw e;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new DataAccessException("数据访问失败");
//        } finally {
//            JDBCUtil.close(conn, ps, rs);
//        }
//        return students;
//    }
//
//    // 5.根据学号查询指定学生信息
//    public static Student selectByNo(Integer no) throws DataAccessException {
//        Connection conn=null;
//        PreparedStatement ps=null;
//        ResultSet rs=null;
//        Student student=new Student();
//        try {
//            conn = JDBCUtil.getConnection();
//            String sql = new StringBuffer()
//                    .append(" select * from ")
//                    .append(" t_stu")
//                    .append("  where no=")
//                    .append("?")
//                    .toString();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, no);
//            rs=ps.executeQuery();
//            while(rs.next()){
//                student.setId(rs.getInt("id"));
//                student.setNo(rs.getInt("no"));
//                student.setName(rs.getString("name"));
//                student.setAge(rs.getInt("age"));
//            }
//        } catch (DataAccessException e) {
//            e.printStackTrace();
//            throw e;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new DataAccessException("数据访问失败");
//        } finally {
//            JDBCUtil.close(conn, ps, rs);
//        }
//        return student;
//    }
//
//    // 6.根据姓名进行模糊查询
//    public static List<Student> selectByName(String name) throws DataAccessException {
//        Connection conn=null;
//        PreparedStatement ps=null;
//        ResultSet rs=null;
//        List<Student> students=new ArrayList<>();
//        Student student=new Student();
//        try {
//            conn = JDBCUtil.getConnection();
//            String sql = new StringBuffer()
//                    .append(" select * from ")
//                    .append(" t_stu")
//                    .append("  where name like ")
//                    .append(" ? ")
//                    .append(" escape '/'")
//                    .toString();
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, "%"+ ParameterUtil.escapeString(name) +"%");
//            rs=ps.executeQuery();
//            while(rs.next()){
//                student.setId(rs.getInt("id"));
//                student.setNo(rs.getInt("no"));
//                student.setName(rs.getString("name"));
//                student.setAge(rs.getInt("age"));
//                students.add(student);
//            }
//        } catch (DataAccessException e) {
//            e.printStackTrace();
//            throw e;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new DataAccessException("数据访问失败");
//        } finally {
//            JDBCUtil.close(conn, ps, rs);
//        }
//        return students;
//    }
//
//    // 7.根据年龄范围查询指定学生信息
//    public static List<Student> selectByAge(Integer begin,Integer end) throws DataAccessException {
//        Connection conn=null;
//        PreparedStatement ps=null;
//        ResultSet rs=null;
//        List<Student> students=new ArrayList<>();
//        Student student=new Student();
//        try {
//            conn = JDBCUtil.getConnection();
//            String sql = new StringBuffer()
//                    .append(" select * from ")
//                    .append(" t_stu")
//                    .append("  where age >= ? and ")
//                    .append("age <= ? ")
//                    .toString();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, begin);
//            ps.setInt(2, end);
//            rs=ps.executeQuery();
//            while(rs.next()){
//                student.setId(rs.getInt("id"));
//                student.setNo(rs.getInt("no"));
//                student.setName(rs.getString("name"));
//                student.setAge(rs.getInt("age"));
//                students.add(student);
//            }
//        } catch (DataAccessException e) {
//            e.printStackTrace();
//            throw e;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new DataAccessException("数据访问失败");
//        } finally {
//            JDBCUtil.close(conn, ps, rs);
//        }
//        return students;
//    }
//
//}
//
