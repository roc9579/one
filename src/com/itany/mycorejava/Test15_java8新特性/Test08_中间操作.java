package com.itany.mycorejava.Test15_java8新特性;

import java.util.Arrays;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月15日10:35
 */
public class Test08_中间操作 {
    private static List<Integer> list= Arrays.asList(1,23,45,1,64,76,21,5647,62,21,57);
    public static void main(String[] args) {
//        testFilter();
//        testDistinct();
//        testLimit();
//        testSkipLimit(2,3);
//        testMap();
        testSortedComparator();
    }
    public static void testFilter(){
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);
    }

    public static void testDistinct(){
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void testLimit(){
        list.stream()
                .limit(5)
                .forEach(System.out::println);
    }

    public static void testSkip(){
        list.stream()
                .skip(5)
                .forEach(System.out::println);
    }

    public static void testSkipLimit(Integer PageNo,Integer PageSize){
        list.stream()
                .skip((PageNo-1)* PageSize)
                .limit(PageSize)
                .forEach(System.out::println);
    }

    public static void testMap(){
        list.stream()
                .map(i->i*2)
                .forEach(System.out::println);
    }

    public static void testSorted(){
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void testSortedComparator(){
        list.stream()
                .sorted((i1,i2)->i2-i1)
                .forEach(System.out::println);
    }
}
