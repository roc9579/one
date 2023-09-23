package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月05日11:47
 */
public class Test09 {
    public static void main(String[] args) {
        // 官方提供了一个线程实例的对象:ThreadLocal
        ThreadLocal<String> local = new ThreadLocal<>();
        // 通过自定义的get方法与set方法获取
        local.set("aaa");
        System.out.println("main线程:" + local.get());
        local.set("bbb");
        System.out.println("main线程:" + local.get());
        local.set("ccc");
        System.out.println("main线程:" + local.get());
        // 一个新的线程
        new Thread() {
            @Override
            public void run() {
                local.set("abc");
                System.out.println("新线程:" + local.get());
            }
        }.start();
        System.out.println("main线程:" + local.get());
    }
}

