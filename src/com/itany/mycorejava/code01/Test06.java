package com.itany.mycorejava.code01;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月10日10:34
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入java成绩：");
        double sjava = sc.nextDouble();
        System.out.print("请输入web成绩：");
        double sweb = sc.nextDouble();
        System.out.print("请输入mysql成绩：");
        double smysql = sc.nextDouble();
        double sum = sjava + sweb + smysql;
        double avg = sum / 3;
        System.out.println("总分："+sum);
        System.out.println("平均分："+avg);
    }
}
