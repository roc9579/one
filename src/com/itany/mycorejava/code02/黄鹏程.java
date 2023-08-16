package com.itany.mycorejava.code02;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月10日16:05
 */
public class 黄鹏程 {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三角形的第一个边长");
        int a = sc.nextInt();
        System.out.print("请输入三角形的第二个边长");
        int b = sc.nextInt();
        System.out.print("请输入三角形的第三个边长");
        int c = sc.nextInt();
        System.out.println(a + b > c && a + c > b && b + c > a ? "是三角形" : "不是三角形");

        //2
        int j = 88;
        int t = (244 - 2 * j) / 2;
        j = 88 - t;
        System.out.println("鸡有"+j+"只,兔有"+t);
    }
}
