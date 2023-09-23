package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月04日15:16
 */
public class Test04 {
    public static void main(String[] args) {
        Aa a=new Aa();
        Thread t1=new Thread(a,"t1");
        Thread t2=new Thread(a,"t2");
        Thread t3=new Thread(a,"t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Aa implements Runnable{
    private int num=100;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (num>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"\t"+num--);
                }else {
                    return;
                }
            }

        }
    }
}