package com.itany.mycorejava.code06;

/**
 * @author 黄鹏程
 * @date 2023年08月16日15:43
 */
public class Test0 {
    public static void main(String[] args) {
        SomePerson sc=new SomePerson();
        SomePerson.name="张国荣";
        sc.age=55;
        SomePerson.test();
        sc.test1();
    }
}
class SomePerson {
    static String name;
    double age;
    public static void test() {
        name = "周润发";
        System.out.println(name);
    }
    public void test1() {
        int age = 60;
        System.out.println(name + this.age);
    }
}