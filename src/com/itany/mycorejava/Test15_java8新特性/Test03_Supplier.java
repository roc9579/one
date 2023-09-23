package com.itany.mycorejava.Test15_java8新特性;

import java.util.function.Supplier;

/**
 * @author 黄鹏程
 * @date 2023年09月14日15:21
 */
public class Test03_Supplier {

    public static void main(String[] args) {
        System.out.println(testSupplier(()->"admin"));
    }

    public static String testSupplier(Supplier<String> supplier){
        return supplier.get();
    }
}
