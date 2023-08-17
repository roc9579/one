package com.itany.mycorejava.code06;

/**
 * @author 黄鹏程
 * @date 2023年08月16日15:15
 */
public class Test03_动静 {
    public static void main(String[] args) {
        Test.jshow(19);
        Test.age = 18;
        Test test = new Test();
        test.show("张三");
    }
}

class Test {
    String name;
    static int age;

    public void show(String name) {
        this.name = name + this.name;
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void jshow(int age) {
        System.out.println();
        System.out.println(age);
    }
}