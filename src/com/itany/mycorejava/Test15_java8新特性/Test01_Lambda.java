package com.itany.mycorejava.Test15_java8新特性;

/**
 * @author 黄鹏程
 * @date 2023年09月14日13:49
 */
public class Test01_Lambda {
    public static void main(String[] args) {

        Someinterface someinterface=() -> System.out.println(6);
        someinterface.test();

        Someinterface1 someinterface1=() -> 1;
        System.out.println(someinterface1.test());

        Someinterface2 someinterface2=(i,j) -> i+j;
        System.out.println(someinterface2.test(1,2));

        Someinterface3 someinterface3=i -> i;
        System.out.println(someinterface3.test(9));
    }

}

interface Someinterface{
    void test();
}
interface Someinterface1{
    int test();
}
interface Someinterface2{
    int test(int i,int j);
}
interface  Someinterface3{
    int test(int i);
}