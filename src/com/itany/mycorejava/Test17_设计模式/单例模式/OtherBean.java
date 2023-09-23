package com.itany.mycorejava.Test17_设计模式.单例模式;

/**
 * @author 黄鹏程
 * @date 2023年09月18日14:12
 */
public class OtherBean {
    private OtherBean() {
    }
    private static OtherBean otherBean;

    public static OtherBean getInstance() {
        if (otherBean==null){
            otherBean=new OtherBean();
        }
        return otherBean;
    }
}
