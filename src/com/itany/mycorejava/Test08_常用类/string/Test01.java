package com.itany.mycorejava.Test08_常用类.string;

/**
 * @author 黄鹏程
 * @date 2023年08月23日09:55
 */
public class Test01 {

    public static void main(String[] args) {
        String s=" Hello World I am a Student , Hello World Hello World Hello World ";
        System.out.println(s.length());
        s=s.trim();
        System.out.println(s.length());
        System.out.println(s.indexOf("am"));
        System.out.println(s.lastIndexOf("Hello"));
        System.out.println(s.indexOf("am",10));
        System.out.println(s.indexOf("am",30));
        System.out.println(s.lastIndexOf("World",1));
        System.out.println(s.lastIndexOf("World",30));
        System.out.println(s.substring(30));
        System.out.println(s.substring(0,30));
        String s1="666";
        System.out.println(s1.concat("777"));
        String s2="";
        String s3=null;
        String s4=new String();
        System.out.println(s2.isEmpty());
        //System.out.println(s3.isEmpty());
        System.out.println(s4.isEmpty());
    }

}
