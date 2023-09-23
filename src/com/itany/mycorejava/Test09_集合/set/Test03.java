package com.itany.mycorejava.Test09_集合.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 黄鹏程
 * @date 2023年08月29日15:13
 */
public class Test03 {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);
    }
}
