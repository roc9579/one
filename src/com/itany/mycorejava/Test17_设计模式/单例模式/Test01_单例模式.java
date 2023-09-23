package com.itany.mycorejava.Test17_设计模式.单例模式;

/**
 * @author 黄鹏程
 * @date 2023年09月18日13:56
 */
public class Test01_单例模式 {
    public static void main(String[] args) {
        SomeBean instance = SomeBean.getInstance();
        SomeBean instance1 = SomeBean.getInstance();
        System.out.println(instance==instance1);
        OtherBean otherBean=OtherBean.getInstance();
        OtherBean otherBean2 = OtherBean.getInstance();
        System.out.println(otherBean==otherBean2);
    }
}
