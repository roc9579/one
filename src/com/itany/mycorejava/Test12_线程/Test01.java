package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月04日11:27
 */
public class Test01 {
    public static void main(String[] args) {

        SomeThread s1=new SomeThread("s1");
        SomeThread s2=new SomeThread("s2");
        SomeThread s3=new SomeThread("s3");
        s1.start();
        s2.start();
        s3.start();

    }
}
class SomeThread extends Thread{
    private String name;

    public SomeThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0;i<99;i++){
            System.out.println(name+"\t"+7);
        }
    }
}