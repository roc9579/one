package com.itany.mycorejava.Test13_jdbc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月13日17:13
 */
public class Classs implements Serializable {
    private Integer id;
    private String no;
    private String major;
    private List<Student> students=new ArrayList<>();
    public void addS(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "Classs{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", major='" + major + '\'' +
                ", students=" + students +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Classs(Integer id, String no, String major) {
        this.id = id;
        this.no = no;
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Classs(String no, String major) {
        this.no = no;
        this.major = major;
    }

    public Classs() {
    }
}
