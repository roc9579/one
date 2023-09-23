package com.itany.mycorejava.Test13_jdbc;

import com.itany.mycorejava.util.ParameterUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月13日16:32
 */
// 两张表
// 班级表:主键、班级号(唯一不为空)、所属专业
// 学生表:主键、学号、姓名、年龄、所属班级(外键)
//    create table t_cla(
//            id int primary key auto_increment,
//            no varchar(20) unique not null,
//            major varchar(20) not null
//            );
//    create table t_stu(
//            id int primary key auto_increment,
//            no varchar(20),
//            name varchar(20),
//            age int,
//            class_id int
//            );

public class 黄鹏程9_13_hw {
    public static void main(String[] args) throws DataAccessException {
//        Classs classs=new Classs("002","农业科学");
//        Integer classId= insertClass(classs);
//        Student s1=new Student("004","jack",19,classId);
//        Student s2=new Student("005","%",23,classId);
//        Student s3=new Student("006","a%",15,classId);
//        insertStudent(s1);
//        insertStudent(s2);
//        insertStudent(s3);
//        System.out.println(selectByClassNo("001"));
//        System.out.println(selectAllStudent());
        System.out.println(selectStudentByName("a"));
    }

    // 1.保存班级以及该班中的所有学生信息
    public static Integer insertClass(Classs classs) throws DataAccessException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Integer id = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = new StringBuffer()
                    .append("insert into ")
                    .append(" t_cla(no,major) ")
                    .append(" values(?,?)")
                    .toString();
            ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, classs.getNo());
            ps.setString(2, classs.getMajor());
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
    public static void insertStudent(Student student) throws DataAccessException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = new StringBuffer()
                    .append("insert into ")
                    .append(" t_stu(no,name,age,class_id) ")
                    .append(" values(?,?,?,?)")
                    .toString();
            ps = conn.prepareStatement(sql);
            ps.setString(1, student.getNo());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setInt(4, student.getClassId());
            ps.executeUpdate();
        } catch (DataAccessException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtil.close(conn, ps, null);
        }
    }

    // 2.根据班级号查询指定班级以及该班级中所有学生信息
    public static Classs selectByClassNo(String no) throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Classs classs=null;
        try {
            conn=JDBCUtil.getConnection();
            String sql=new StringBuffer()
                    .append("select c.id,c.no,c.major,s.id 's.id',s.no 's.no',s.name,s.age,s.class_id ")
                    .append(" from t_cla c ")
                    .append(" left join t_stu s ")
                    .append("  on c.id=s.class_id ")
                    .append(" where c.no= ? ")
                    .toString();
            ps=conn.prepareStatement(sql);
            ps.setString(1,no);
            rs=ps.executeQuery();
            while (rs.next()){
                if (classs==null){
                    classs=new Classs();
                    classs.setId(rs.getInt("id"));
                    classs.setNo(rs.getString("no"));
                    classs.setMajor(rs.getString("major"));
                }
                Student student=new Student();
                student.setId(rs.getInt("s.id"));
                student.setNo(rs.getString("s.no"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setClassId(rs.getInt("class_id"));
                classs.addS(student);
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtil.close(conn,ps,rs);
        }
        return classs;

    }

    // 3.查询所有学生以及其所属班级信息
    public static List<Student> selectAllStudent() throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Student> students=new ArrayList<>();
        try {
            conn=JDBCUtil.getConnection();
            String sql=new StringBuffer()
                    .append("select s.id,s.no,s.name,s.age,s.class_id,c.id 'c.id',c.no 'c.no',c.major")
                    .append(" from t_stu s ")
                    .append(" left join t_cla c ")
                    .append("  on s.class_id=c.id ")
                    .toString();
            ps= conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Classs classs=new Classs();
                classs.setId(rs.getInt("c.id"));
                classs.setNo(rs.getString("c.no"));
                classs.setMajor(rs.getString("major"));
                Student student=new Student();
                student.setId(rs.getInt("id"));
                student.setNo(rs.getString("no"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setClassId(rs.getInt("class_id"));
                student.setClasss(classs);
                students.add(student);
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtil.close(conn,ps,rs);
        }
        return students;
    }

    //4.根据学生姓名模糊查询学生以及学生所属班级信息
    public static List<Student> selectStudentByName(String name) throws DataAccessException {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        List<Student> students=new ArrayList<>();
        try {
            conn=JDBCUtil.getConnection();
            String sql=new StringBuffer()
                    .append("select s.id,s.no,s.name,s.age,s.class_id,c.id 'c.id',c.no 'c.no',c.major")
                    .append(" from t_stu s ")
                    .append(" left join t_cla c ")
                    .append("  on s.class_id=c.id ")
                    .append(" where s.name like ? ")
                    .append(" escape '/'")
                    .toString();
            ps= conn.prepareStatement(sql);
            ps.setString(1,"%"+ ParameterUtil.escapeString(name)+"%");
            rs=ps.executeQuery();
            while (rs.next()){
                Classs classs=new Classs();
                classs.setId(rs.getInt("c.id"));
                classs.setNo(rs.getString("c.no"));
                classs.setMajor(rs.getString("major"));
                Student student=new Student();
                student.setId(rs.getInt("id"));
                student.setNo(rs.getString("no"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setClassId(rs.getInt("class_id"));
                student.setClasss(classs);
                students.add(student);
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtil.close(conn,ps,rs);
        }
        return students;
    }
}
