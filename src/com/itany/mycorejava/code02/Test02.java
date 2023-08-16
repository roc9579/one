package com.itany.mycorejava.code02;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月10日11:47
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个年份");
        int years = sc.nextInt();
        System.out.println((years % 4 == 0) & (years % 100 != 0) || years % 400 == 0 ? years+"是闰年" : years+"不是闰年");
    }
}
