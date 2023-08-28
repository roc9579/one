package com.itany.mycorejava.Test08_常用类.string;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月23日10:36
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.将字符串Hello World转换成dlroW olleH
        String s="Hello World";
        String s1="";
        for (int i=0;i<s.length();i++){
            char temp=s.charAt(s.length()-1-i);
            s1=s1+temp;
        }
        System.out.println(s1);

        // 2.将字符串Hello World转换为WROLD_HELLO
        String s2="Hello World";
        s2=s2.toUpperCase();
        s2=s2.replace(" ","_");
        String s3=s2.substring(0,5);
        String s4=s2.substring(6);
        s2=s4+"_"+s3;
        System.out.println(s2);


        // 3.在控制台输入任意一个字符串,将字符串每4个字符后添加一个短横线‐,并将所有大写字母变成小写字母,小写变成大写字母
        Scanner sc=new Scanner(System.in);
        String s5=sc.nextLine();
        String s6="";
        for (int i=0;i<s5.length();i++){
            char temp=s5.charAt(i);
            String s7=""+temp;
            if (s7.equals(s7.toUpperCase())){
                s7=s7.toLowerCase();
            }else{
                s7=s7.toUpperCase();
            }
            s6=s6+s7;
            if ((i+1)%4==0 && (i+1)!=s5.length()-1){
                s6=s6+"-";
            }
        }
        System.out.println(s6);
    }
}
