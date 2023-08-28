package com.itany.mycorejava.Test11;

/**
 * @author 黄鹏程
 * @date 2023年08月18日13:45
 */
public class 常量 {
    public static void main(String[] args) {
        int i=1;
        i=2;
    }

    final public void show(String name){
        System.out.println(666);
    }
}

class Cell{
    public void show(String name){
        System.out.println(666);
    }
}
class Cell1 extends Cell{
    public void show(String name){
        System.out.println(666);
    }
}