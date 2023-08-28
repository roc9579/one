package com.itany.mycorejava.Test08_常用类.string;

import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年08月23日13:55
 */
public class Test03 {
    public static void main(String[] args) {
        String s="Hello World";
        char[] cs=s.toCharArray();
        System.out.println(cs);
        System.out.println(Arrays.toString(cs));

        String s1=new String(cs);
        System.out.println(s1);

        byte[] bs=s.getBytes();
        System.out.println(bs);
        System.out.println(Arrays.toString(bs));

        int i=10;
        String s2=""+i;
        System.out.println(s2);
        String s3=String.valueOf(i);
        System.out.println(s3);


        int is=Integer.parseInt(s2);
        System.out.println(is);


        double d=3.14;
        String ds=d+"";
        System.out.println(ds);

        String s4=String.valueOf(d);
        System.out.println(s4);

        double d1=Double.parseDouble(s4);
        System.out.println(d1);
    }
}
