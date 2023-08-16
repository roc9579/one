package com.itany.mycorejava.code05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月15日11:22
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[][] score=new double[3][5];
        System.out.println("请输入第一个班的第一个学生成绩");
        score[0][0]=sc.nextDouble();
        double max=score[0][0];
        double min=score[0][0];
        for (int i=0;i<3;i++){
            double sum=0;
            for (int j=0;j<5;j++){
                if(i==0&&j==0){

                }else {
                    System.out.println("请输入第"+(i+1)+"个班的第"+(j+1)+"个学生的成绩");
                    score[i][j]=sc.nextDouble();
                    if (max<score[i][j]){
                        max=score[i][j];
                    }
                    if (min>score[i][j]){
                        min=score[i][j];
                    }
                }
                sum=sum+score[i][j];
            }
            System.out.println("第"+(i+1)+"个班的平均分"+(sum/5));
        }
//        Arrays.sort(score[0]);
//        Arrays.sort(score[1]);
//        Arrays.sort(score[2]);
//        double max=score[0][4];
//        double min=score[0][0];
//        for (int i=0;i<3;i++){
//            if (max<score[i][4]){
//                max=score[i][4];
//            }
//        }
//        for (int i=0;i<3;i++){
//            if (min>score[i][0]){
//                min=score[i][0];
//            }
//        }
        System.out.println("最高分"+max+"最低分"+min);

    }
}
