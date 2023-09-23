package com.itany.mycorejava.Test09_集合.collections;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author 黄鹏程
 * @date 2023年08月30日15:18
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,4,7,8,3,4));
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if (i1>i2){
                    return -1;
                }else if (i1<i2){
                    return 1;
                }
                return 0;
            }
        });
        System.out.println(list);
    }
}
