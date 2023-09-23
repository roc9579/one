package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月05日10:42
 */
public class Test08 {
    public static void main(String[] args) {
        Pool pool=new Pool();
        Product p1=new Product("p1",pool);
        Product p2=new Product("p2",pool);
        Product p3=new Product("p3",pool);
        Consumer c1=new Consumer("c1",pool);
        Consumer c2=new Consumer("c2",pool);
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
    }
}
class Pool{
    int num;
    private static final int MAX=20;

    public int product(){
        num++;
        return num;
    }
    public int consumer(){
        num--;
        return num;
    }
    public boolean isEmpty(){
        return this.num==0;
    }
    public  boolean isFull(){
        return this.num==MAX;
    }
}


class Product extends Thread{
    private Pool pool;
    String name;

    public Product(String name, Pool pool) {

        this.pool = pool;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            synchronized (pool){
                if (pool.isFull()){
                    try {
                        pool.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    int num=pool.product();
                    System.out.println(name+"\t"+num);
                    pool.notifyAll();
                }
            }
        }
    }
}
class Consumer extends Thread{
    private Pool pool;
    String name;

    public Consumer(String name, Pool pool) {
        this.pool = pool;
        this.name = name;
    }

    public void run() {
        while (true){
            synchronized (pool){
                if (pool.isEmpty()){
                    try {
                        pool.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    int num=pool.consumer();
                    System.out.println(name+"\t"+num);
                    pool.notifyAll();
                }
            }
        }
    }

}