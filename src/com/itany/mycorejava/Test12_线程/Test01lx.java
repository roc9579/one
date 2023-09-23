package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月04日11:52
 */
// 使用线程实现售票功能,共有两个售票窗口,共出售100张票
public class Test01lx {
    public static void main(String[] args) {
            SomeThread1 t1=new SomeThread1("t1");
            t1.start();
            SomeThread1 t2=new SomeThread1("t2");
            t2.start();
    }
}
class SomeThread1 extends Thread{
    private String name;
    private static int num=1;
    public SomeThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (num<=100){
            System.out.println(name+"\t"+num);
            num++;
        }
    }
}