package com.itany.mycorejava.Test09_集合.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 黄鹏程
 * @date 2023年08月29日14:13
 */
public class Test02 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.size());
        set.remove(3);
        System.out.println(set);
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.contains(1));
        Iterator<Integer> it= set.iterator();
    }
}
