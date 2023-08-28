package com.itany.mycorejava.Test08_常用类.string;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月23日16:34
 */
public class Test05 {
    public static void main(String[] args) {
        // 在控制台输入一个手机号码,判断手机号码格式是否正确
        // 手机号码格式如果正确,则返回手机号码格式正确
        // 手机号码格式如果不正确,手机号码格式不正确,请重新输入,且必须重新输入,直到正确为止
        // 手机号码由11位数字组成,必须以13、15、16、18、19开头
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请输入手机号码");
            String phone= sc.next();
            String s1=phone.substring(0,2);
            if (phone.matches("\\d{11}") && s1.matches("(13)+|(15)+|(16)+|(18)+|(19)+")){
                System.out.println("手机号码格式正确");
                break;
            }
            System.out.println("手机号码格式不正确,请重新输入");
        }
    }
}
