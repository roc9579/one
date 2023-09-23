package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月04日14:21
 */
public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        A a=new A();
        Thread t1=new Thread(a,"t1");
        t1.start();
        for (int i=0;i<100;i++){
//            if (i==10){
//                t1.join();
//            }
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
        //t1.interrupt();
    }
}
class A implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
//            if (i==10){
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}