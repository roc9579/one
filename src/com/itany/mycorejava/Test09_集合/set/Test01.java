package com.itany.mycorejava.Test09_集合.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author 黄鹏程
 * @date 2023年08月29日13:51
 */
public class Test01 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>(10);
        HashSet<Integer> set3=new HashSet<>(10,0.5f);
        HashSet<Integer> set4=new HashSet<>(Arrays.asList(1,5,8,6,2,3,4,5,5,6));
        System.out.println(set4);
    }
}
