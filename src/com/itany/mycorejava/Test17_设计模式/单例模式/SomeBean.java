package com.itany.mycorejava.Test17_设计模式.单例模式;

/**
 * @author 黄鹏程
 * @date 2023年09月18日13:56
 */
public class SomeBean {
    private SomeBean() {
    }
    private static SomeBean someBean=new SomeBean();
    public static SomeBean getInstance(){
        return someBean;
    }
}
