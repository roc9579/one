package com.itany.mycorejava.homework.黄鹏程;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月11日15:01
 */
public class 黄鹏程_程序结构 {
    public static void main(String[] args) {
        jjcfb();
//        csz();
//        dysjx();
//        ddysjx();
//        lx();
    }
    public static void jjcfb(){
        //九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }

    public static void csz(){
        //猜数字
        int num = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            System.out.print("请输入猜的数字");
            int cai = sc.nextInt();
            if (cai == num) {
                System.out.println("猜对了,您一共猜了" + i + "次");
                break;
            } else if (cai < num) {
                System.out.println("猜小了");
            } else if (cai > num) {
                System.out.println("猜大了");
            }
        }
    }

    public static void dysjx(){
        //打印等腰三角形
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入打印几行");
        int b=sc.nextInt();
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

    public static void ddysjx(){
        //打印倒等腰三角形
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入打印几行");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(b-i)+1;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lx(){
        //打印棱形
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入打印几行");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int k=1;k<=b-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){

                System.out.print("*");
            }
            System.out.println();
        }
        b=b-1;
        for(int i=1;i<=b;i++){
            System.out.print(" ");
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(b-i)+1;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
