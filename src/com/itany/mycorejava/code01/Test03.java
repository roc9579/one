package com.itany.mycorejava.code01;

/**
 * @author 黄鹏程
 * @date 2023年08月09日14:56
 */
public class Test03 {
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 3.44F;
        double d = 3.77;
        char c = '5';
        int sum = b + c;
        System.out.println(sum);
        byte b2 = (byte)s;
        System.out.println(b2);
        byte b3 = (byte)1000;
        System.out.println(b3);
        float f2 = (float)d;
        System.out.println(f2);
        char c2 =(char)i;
        System.out.println(c2);
        int i2 = (int)d;
        System.out.println(i2);

        byte g1 = 5;
        short h1 = 6;
        int j1 = g1 + h1;
    }
}
