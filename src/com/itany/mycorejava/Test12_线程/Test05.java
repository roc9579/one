package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月04日15:55
 */
public class Test05 {
    public static void main(String[] args) {
        Object obj1=new Object();
        Object obj2=new Object();
        A1 a1=new A1(obj1,obj2);
        B1 b1=new B1(obj1,obj2);
        Thread t1=new Thread(a1,"t1");
        Thread t2=new Thread(b1,"t2");
        t1.start();
        t2.start();
    }
}
class A1 implements Runnable {
    Object obj1;
    Object obj2;

    public A1(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj1){
            System.out.println("obj1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2){
                System.out.println("obj2");
            }
        }
    }
}
class B1 implements Runnable {
    Object obj1;
    Object obj2;

    public B1(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj2){
            System.out.println("obj2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1){
                System.out.println("obj1");
            }
        }
    }
}