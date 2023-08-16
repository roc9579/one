package com.itany.mycorejava.code05;

import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年08月15日13:46
 */
public class Test06 {
    public static void main(String[] args) {
        test(1,2,34,5,6,5);
    }
    public static void test(int i,int j,int... nums){
        System.out.println(i);
        System.out.println(j);
        System.out.println(Arrays.toString(nums));
    }
}
