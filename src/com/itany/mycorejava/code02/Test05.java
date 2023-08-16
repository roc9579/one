package com.itany.mycorejava.code02;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月10日16:51
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份");
        int year = sc.nextInt();
        System.out.print("请输入月份");
        int month = sc.nextInt();
        int day;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            switch(month){
                case 2:day = 29;
                    break;
                case 4:day = 30;
                    break;
                case 6:day = 30;
                    break;
                case 9:day = 30;
                    break;
                case 11:day = 30;
                    break;
                default:day = 31;
            }
        } else{
            switch(month){
                case 2:day = 28;
                    break;
                case 4:day = 30;
                    break;
                case 6:day = 30;
                    break;
                case 9:day = 30;
                    break;
                case 11:day = 30;
                    break;
                default:day = 31;
            }
        }
        System.out.println("一共有"+day+"天");
    }
}
