package com.itany.mycorejava.Test15_java8新特性;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author 黄鹏程
 * @date 2023年09月15日11:45
 */
public class Test09_终止操作 {
    private static List<Integer> list= Arrays.asList(2,23,3,42,5,56,53,234,3,2242,42);
    public static void main(String[] args) {
//        testAllMatch();
//        testFindFirst();
        testFindAny();
    }

    public static void testAllMatch(){
        System.out.println(list.stream().allMatch(i -> i%2==0 ));
    }

    public static void testAnyMatch(){
        System.out.println(list.stream().anyMatch(i -> i%2==0 ));
    }

    public static void testNoneMatch(){
        System.out.println(list.stream().noneMatch(i -> i%2==0 ));
    }

    public static void testFindFirst(){
        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first.get());
    }

    public static void testFindAny(){
        Optional<Integer> first = list.stream().findAny();
        System.out.println(first.get());
        new Thread(){
            @Override
            public void run() {
                Optional<Integer> first = list.stream().findAny();
                System.out.println(first.get());
            }
        }.start();
    }
}
