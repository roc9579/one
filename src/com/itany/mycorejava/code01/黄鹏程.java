package com.itany.mycorejava.code01;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月09日17:14
 */
public class 黄鹏程 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数");
        int i1 = sc.nextInt();
        System.out.print("请输入第二个整数");
        int i2 =sc.nextInt();

        //方式一
       /* int i3 = i1;
        i1 = i2;
        i2 = i3;
        System.out.println(i1+","+i2);*/

        //方式二
        i1 = i1 + i2;
        i2 = i1 - i2;
        i1 = i1 - i2;
        System.out.println(i1+","+i2);



    }
}
