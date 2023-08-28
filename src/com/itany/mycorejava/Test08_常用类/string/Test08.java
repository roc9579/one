package com.itany.mycorejava.Test08_常用类.string;

/**
 * @author 黄鹏程
 * @date 2023年08月24日11:53
 */
public class Test08 {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("666");
        buffer.append("777");
        buffer.insert(5,"8");

        System.out.println(buffer);

    }
}
