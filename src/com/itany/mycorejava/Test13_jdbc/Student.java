package com.itany.mycorejava.Test13_jdbc;

import java.io.Serializable;

/**
 * @author 黄鹏程
 * @date 2023年09月13日17:09
 */
public class Student implements Serializable {
    private Integer id;
    private String no;
    private String name;
    private Integer age;
    private Integer classId;
    private Classs classs=null;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                ", classs=" + classs +
                '}';
    }

    public Classs getClasss() {
        return classs;
    }

    public void setClasss(Classs classs) {
        this.classs = classs;
    }

    public Student() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Student(String no, String name, Integer age, Integer classId) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    public Student(Integer id, String no, String name, Integer age, Integer classId) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.age = age;
        this.classId = classId;
    }
}
