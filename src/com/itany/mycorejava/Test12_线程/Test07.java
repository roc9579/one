package com.itany.mycorejava.Test12_线程;

/**
 * @author 黄鹏程
 * @date 2023年09月04日16:51
 */
// 定义两个线程分别打印不同的内容,要求两个线程之间交替执行10次
// 例如第一个线程打印Hello,第二个线程打印World
// 其结果为HelloWorldHelloWorldHelloWorldHelloWorld....
// 或者WorldHelloWorldHelloWorldHelloWorldHello...
public class Test07 {
    public static void main(String[] args) {
        Object o1=new Object();
        Hello hello=new Hello(o1);
        Word word=new Word(o1);
        Thread t1=new Thread(hello);
        Thread t2=new Thread(word);
        t1.start();
        t2.start();
    }
}
class Hello implements Runnable{
    int i=10;
    Object o1;

    public Hello(Object o1) {
        this.o1=o1;
    }

    @Override
    public void run() {
        while (true){
            if (i>0){
                synchronized (o1){
                    System.out.print("Hello");
                    i--;
                    o1.notifyAll();
                    try {
                        o1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else {
                break;
            }

        }
    }
}class Word implements Runnable{
    int i=10;
    Object o1;

    public Word(Object o1) {
        this.o1=o1;
    }

    @Override
    public void run() {
        while (true){
            if (i>0){
                synchronized (o1){
                    System.out.print("Word");
                    i--;
                    o1.notifyAll();
                    try {
                        o1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else {
                break;
            }

        }
    }
}