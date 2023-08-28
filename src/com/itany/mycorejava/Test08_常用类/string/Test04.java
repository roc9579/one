package com.itany.mycorejava.Test08_常用类.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年08月23日15:22
 */
public class Test04 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        code();
    }
    public static void code() throws UnsupportedEncodingException {
        String s="哈哈";
        System.out.println(s);
        byte[] bs= s.getBytes("GBK");
        System.out.println(Arrays.toString(bs));
        String s1=new String(bs,"GBK");
        System.out.println(s1);

        System.out.println(System.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset());

        String s2="你好先是";
        byte[] bs1=s2.getBytes("UTF-8");
        String s3=new String(bs1,"UTF-8");
        System.out.println(s3);
        String s4=new String(bs1,"GBK");
        System.out.println(s4);
        byte[] bs2=s4.getBytes("GBK");
        String s5=new String(bs2,"UTF-8");
        System.out.println(s5);
    }
}
