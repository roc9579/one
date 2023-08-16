package com.itany.mycorejava.code01;
import java.util.Scanner;
/**
 * @author 黄鹏程
 * @date 2023年08月09日15:56
 */
public class Test04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入姓名："+name);
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入年龄："+age);
        System.out.print("请输入性别：");
        String gender = sc.next();
        System.out.println("请输入性别："+gender);
        System.out.print("请输入专业：");
        String major = sc.next();
        System.out.println("请输入专业："+major);
        System.out.print("请输入课程：");
        String course = sc.next();
        System.out.println("请输入课程："+course);
        System.out.print("请输入成绩：");
        double score = sc.nextDouble();
        System.out.print("请输入成绩："+score);
    }
}
