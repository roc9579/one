package com.itany.mycorejava.Test15_java8新特性;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author 黄鹏程
 * @date 2023年09月14日16:04
 */
public class Test05_Function {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        testFunction(new Function<List<Integer>, Integer>() {
            @Override
            public Integer apply(List<Integer> list) {
                return list.size();
            }
        },list);

        System.out.println(testFunction(list1 -> list.size(),list));
    }

    public static Integer testFunction(Function<List<Integer>,Integer> function,List<Integer> list){
        return function.apply(list);
    }
}
