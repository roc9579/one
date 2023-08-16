package com.itany.mycorejava.code02;


import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月10日15:04
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个成绩");
        double s = sc.nextDouble();
        if(s >= 0 && s <= 100){
            if (s >= 90 && s < 100) {
                System.out.println("优秀");
            } else if(s >= 80 && s < 90){
                System.out.println("良好");
            } else if(s >= 60 && s < 80){
                System.out.println("及格");
            } else if(s >= 0 && s < 60){
                System.out.println("不及格");
            }
        } else{
            System.out.println("成绩不合法");
        }

        //2
        System.out.print("请输入年份");
        int year = sc.nextInt();
        System.out.print("请输入月份");
        int month =sc.nextInt();
        if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
            if(month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12){
                System.out.println("这个月一共有31天");
            } else if(month == 2){
                System.out.println("这个月有29天");
            } else{
                System.out.println("这个月有30天");
            }
        }else{
            if(month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12){
                System.out.println("这个月一共有31天");
            } else if(month == 2){
                System.out.println("这个月有28天");
            } else{
                System.out.println("这个月有30天");
            }
        }

        //3
        System.out.print("请输入三角形的边长");
        double a1 = sc.nextDouble();
        System.out.print("请输入三角形的边长");
        double a2 = sc.nextDouble();
        System.out.print("请输入三角形的边长");
        double a3 = sc.nextDouble();
        if(a1+a2>a3 && a1+a3>a2 && a2+a3>a1){
            if(a1 == a2 || a2 == a3 || a1 ==a3){
                if(a1 == a2 && a2 == a3){
                    System.out.println("等边三角形");
                }else{
                    System.out.println("等腰三角形");
                }
            } else if (a1 * a1 + a2 * a2 == a3 * a3 || a1 * a1 + a3 * a3 == a2 * a2 || a2 * a2 + a3 * a3 == a1 * a1) {
                System.out.println("直角三角形");
            } else{
                System.out.println("普通三角形");
            }
        } else{
            System.out.println("不是三角形");
        }



    }
}