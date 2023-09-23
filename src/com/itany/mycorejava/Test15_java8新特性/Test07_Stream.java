package com.itany.mycorejava.Test15_java8新特性;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @author 黄鹏程
 * @date 2023年09月15日09:40
 */
public class Test07_Stream {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4);
        Stream<Integer> listStream=list.stream();
        listStream.forEach(System.out::println);
        System.out.println("---------------------------------------");

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"admin");
        map.put(2,"alice");
        map.put(3,"tom");
        Stream<Integer> mapStream= map.keySet().stream();
        mapStream.forEach(System.out::println);
        System.out.println("---------------------------------------");

        Stream<Map.Entry<Integer,String >> mapStream1=map.entrySet().stream();
        mapStream1.forEach(System.out::println);
        System.out.println("---------------------------------------");

        Integer[] arr={1,2,3,4};
        Stream<Integer> arrStream=Arrays.stream(arr);
        arrStream.forEach(System.out::println);
        System.out.println("---------------------------------------");

        Stream<Integer> s1=Stream.of(1,2,3);
        s1.forEach(System.out::println);
        System.out.println("---------------------------------------");

        UnaryOperator<Integer> operator=UnaryOperator.identity();
        Stream<Integer> s2=Stream.iterate(1,operator);
        s2.forEach(System.out::println);
    }
}
