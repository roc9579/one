package com.itany.mycorejava.Test08_常用类.random;

import java.util.Random;

/**
 * @author 黄鹏程
 * @date 2023年08月25日13:45
 */
public class Test01_random {
    public static void main(String[] args) {
        //随机生成一个字符串,字符串由四个字符组成,每一个字符由英文字母数字组成
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(charSet.length());
            char randomChar = charSet.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        String randomString = stringBuilder.toString();
        System.out.println(randomString);
    }
}
