package com.itany.mycorejava.Test15_java8新特性;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 黄鹏程
 * @date 2023年09月14日15:55
 */
public class Test04_Predicate {
    public static void main(String[] args) {
        List<String> lists= Arrays.asList("南京","北京","东京","苏州");
        testPredicate((s)->s.contains("京"),lists);
    }

    public static void testPredicate(Predicate<String> predicate, List<String> lists){
        for(String list:lists){
            if (predicate.test(list)) {
                System.out.println(list);
            }
        }
    }
}
