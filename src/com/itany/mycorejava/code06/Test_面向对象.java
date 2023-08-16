package com.itany.mycorejava.code06;

/**
 * @author 黄鹏程
 * @date 2023年08月16日11:41
 */
public class Test_面向对象 {
    public static void main(String[] args) {
        Student student =new Student();
        student.name="zhangsan";
        student.age=18;
        student.gender="nan";
        student.major="jisuanji";
        student.classNo="1";
        student.jilu();
    }

}

class Student{
    String name;
    int age;
    String gender;
    String major;
    String classNo;
    public void jilu(){
        System.out.println("姓名："+name+"年龄："+age+"性别"+gender+"专业："+major+"班级："+classNo);
    }
}