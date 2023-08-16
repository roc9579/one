package com.itany.mycorejava.code03;

/**
 * @author 黄鹏程
 * @date 2023年08月11日08:56
 */
public class Test01 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (sum <= 3000){
            sum += num;
            num++;
        }
        System.out.println(num-1);
    }
}
