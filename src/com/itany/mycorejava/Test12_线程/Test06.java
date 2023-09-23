package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月04日16:37
 */
public class Test06 {
    public static void main(String[] args) {
        Object obj=new Object();
        A11 a11=new A11(obj);
        B11 b11=new B11(obj);
        Thread t1=new Thread(a11);
        Thread t2=new Thread(b11);
        t1.start();
        t2.start();
    }
}
class A11 implements Runnable{
    Object obj;

    public A11(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){

            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("objA");
        }
    }
}
class B11 implements Runnable{
    Object obj;

    public B11(Object obj) {
        this.obj = obj;
    }

    @Override

    public void run() {
        synchronized (obj){

            System.out.println("objB");
        }
    }
}