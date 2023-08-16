package com.itany.mycorejava.code02;

/**
 * @author 黄鹏程
 * @date 2023年08月10日11:29
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(3 < 7 & 5 < 8);
        System.out.println(5 > 3 && 6 < 5);
        System.out.println(5 >= '5' || 6<3);
        System.out.println(false && 1 / 0 == 0);
        System.out.println(true || 1 / 0 == 0);
        System.out.println(6 == '6');
        System.out.println("----------------------");
        System.out.println(!true);
    }
}
