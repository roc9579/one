package com.itany.mycorejava.Test08_常用类.内部类;

/**
 * @author 黄鹏程
 * @date 2023年08月28日13:45
 */
public class Test04 {
    public static void main(String[] args) {
        SomeIterface someIterface=new SomeIterface() {
            @Override
            public void show() {

            }
        };
    }
}
interface SomeIterface{
    int age=6;
    void show();
}