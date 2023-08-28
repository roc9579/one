package com.itany.mycorejava.homework._8_22.黄鹏程;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月23日17:19
 */
public class Test {
    static Scanner sc=new Scanner(System.in);


    public static void main(String[] args) {
//        phone();
//        q1();
        q2();
//        q3();
//        q4();
//        q5();
//        q6();
//        q7();
    }


    public static void phone(){
        // 在控制台输入一个手机号码,判断手机号码格式是否正确
        // 手机号码格式如果正确,则返回手机号码格式正确
        // 手机号码格式如果不正确,手机号码格式不正确,请重新输入,且必须重新输入,直到正确为止
        // 手机号码由11位数字组成,必须以13、15、16、18、19开头

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

    public static void q1(){
        // 1.控制台输入一个字符串,统计字符串包含多少个数字、英文字母以及其他字符
        System.out.print("请输入一个字符串");
        String s1=sc.nextLine();
        int num=0;
        int ynum=0;
        int qnum=0;
        for (int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            String s2=c+"";
            if (s2.matches("\\d")){
                num++;
            }else if (s2.matches("[a-zA-Z]")){
                ynum++;
            }else{
                qnum++;
            }
        }
        System.out.println("数字个数："+num+", 英文个数:"+ynum+", 其他字符个数:"+qnum);
    }

    public static void q2(){
        // 2.控制台输入一个字符串,统计每个字母出现的次数(忽略大小写)并输出
        System.out.print("请输入一个字符串");
        String s=sc.nextLine();
        s=s.toLowerCase();
        for(char i='a';i<='z';i++){
            int count=0;
            for (int j=0;j<s.length();j++){
                if (i==s.charAt(j)){
                    count++;
                }
            }
            if (count>0){
                System.out.println(""+i+count);
            }

        }

    }

    public static void q3(){
        // 3.控制台输入一个字符串,对字符串中字符进行自然顺序的排序,将排序后的字符串展示出来
        System.out.print("请输入一个字符串");
        String s=sc.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println("排序后的字符串： " + sorted);

    }
    public static void q4(){
        // 4.控制台输入两个字符串,计算第二个字符串在第一个字符串中出现的次数
        System.out.print("请输入一个字符串");
        String s=sc.nextLine();
        System.out.print("请输入一个字符串");
        String s1=sc.nextLine();
        int count=0;
        while (s.indexOf(s1)!=-1){
            s=s.substring(s.indexOf(s1)+s1.length());
            count++;
        }
        System.out.println(count);
    }
    public static void q5(){
        // 5.在控制台输入一个身份证号码,判断身份证号码格式是否正确
        // 身份证号码只能是15位或者18位字符
        // 如果是15位,要求必须全部是数字
        // 如果是18位,要求前17位必须全部是数字,最后一位可以是数字或者X
        while (true){
            System.out.print("请输入一个字符串");
            String s=sc.nextLine();
            if (s.length()==15&&s.matches("\\d+")){
                System.out.println("正确");
                break;
            }else if (s.length()==18&&s.substring(0,17).matches("\\d+")
                    &&s.substring(18).matches("[0-9X]")){
                System.out.println("正确");
                break;
            }
            System.out.println("不正确");
        }


    }
    public static void q6(){
        // 6.在控制台输入一个电子邮箱,判断电子邮箱格式是否正确
        // 要求邮箱必须以英文字母或者数字开头,后面可以跟英文字母数字或者下划线
        // 后面跟@符号,@符号后面跟英文字母或者数字
        // 以.com或者.com.cn结尾
        while (true){
            System.out.print("请输入一个字符串");
            String s=sc.nextLine();
            if (s.matches(".*@.*") && !s.matches(".*@.*@.*")){
                if(s.substring(0,1).matches("[0-9a-zA-Z]")
                        && s.substring(1,s.indexOf("@")).matches("\\w+")
                    && s.substring(s.indexOf("@")+1,s.indexOf(".")).matches("[0-9a-zA-Z]+")
                && s.substring(s.indexOf(".")).matches("(.com)|(.com.cn)")){
                    System.out.println("邮箱正确");
                    break;
                }
            }
            System.out.println("不正确");
        }


    }
    public static void q7(){
        // 7.在控制台输入一个用户名,判断用户名格式是否正确
        // 用户名由字母、数字、下划线、点、减号组成,只能以数字字母开头和结尾,长度4-18位
        while(true){
            System.out.print("请输入一个字符串");
            String s=sc.nextLine();
            if ((s.length()>=4&&s.length()<=18) && s.substring(0,1).matches("[0-9a-zA-Z]")
                    && s.substring(s.length()-1).matches("[0-9a-zA-Z]")
                    && s.matches("[a-zA-Z0-9_\\.-]+")){
                System.out.println("正确");
                break;
            }
            System.out.println("不正确");
        }
    }
}
