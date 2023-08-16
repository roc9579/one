package com.itany.mycorejava.code03;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月11日14:04
 */
public class Test07_打印图形 {
    public static void main(String[] args) {
        //打印正方形
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入正方形边长");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //打印等腰三角形
        for(int i=1;i<=b;i++){
            for(int k=1;k<=b-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
