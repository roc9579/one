package com.itany.mycorejava.Test10_异常;

/**
 * @author 黄鹏程
 * @date 2023年08月31日09:45
 */
public class Test03 {
    public static void main(String[] args) {
        try {
            B.show();
        } catch (ClassNotFoundException e) {
            System.err.println("666");
        }
    }
}
class A{
    public static void show() throws Exception{

    }
}
class B extends A{
    public static void show() throws ClassNotFoundException {
        Class.forName("admin");
    }
}