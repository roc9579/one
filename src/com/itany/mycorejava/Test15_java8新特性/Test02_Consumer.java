package com.itany.mycorejava.Test15_java8新特性;

import java.util.function.Consumer;

/**
 * @author 黄鹏程
 * @date 2023年09月14日14:48
 */
public class Test02_Consumer {
    public static void main(String[] args) {

        Consumer consumer1= s -> System.out.println("您买了"+s+"个玩具");
        consumer1.accept("8");


        Consumer consumer = s -> System.out.println("您买了"+s+"个玩具");
        testConsumer(consumer,"6");


        testConsumer(s -> System.out.println("您买了"+s+"个玩具"),"7");

    }
    public static void testConsumer(Consumer<String> consumer,String s){
        consumer.accept(s);
    }
}
