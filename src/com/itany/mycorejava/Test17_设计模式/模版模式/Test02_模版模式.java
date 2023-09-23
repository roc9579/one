package com.itany.mycorejava.Test17_设计模式.模版模式;

import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年09月18日14:51
 */
public class Test02_模版模式 {
    public static void main(String[] args) {
        String[] strings={"tom","admin","jack"};
        CompareTo.compare(strings,(s1,s2)->s1.length()-s2.length());
        System.out.println(Arrays.toString(strings));
    }
}
