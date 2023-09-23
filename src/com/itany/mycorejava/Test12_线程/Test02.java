package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月04日11:45
 */
public class Test02 {
    public static void main(String[] args) {
        SomeRunable sr=new SomeRunable();
        Thread t1=new Thread(sr);
        Thread t2=new Thread(sr);
        Thread t3=new Thread(sr);
        t1.start();
        t2.start();
        t3.start();

    }
}
class SomeRunable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+"\t"+i);
        }
    }
}