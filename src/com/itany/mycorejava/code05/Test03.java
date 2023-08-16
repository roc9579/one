package com.itany.mycorejava.code05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月14日15:19
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入有几名学生");
        int num = sc.nextInt();
        int[] score=new int[num];
        for (int i=0;i<score.length;i++){
            System.out.print("请输入第"+(i+1)+"个学生的成绩");
            score[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<score.length;i++){
            sum=sum+score[i];
        }
        int avg=sum/num;
        Arrays.sort(score);
        int max=score[score.length-1];
        int min=score[0];
        System.out.println("成绩最大值"+max);
        System.out.println("成绩最小值"+min);
        System.out.println("成绩平均值"+avg);
    }
}
