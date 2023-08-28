package com.itany.mycorejava.Test08_常用类.random;
import java.util.Random;
/**
 * @author 黄鹏程
 * @date 2023年08月26日11:06
 */
public class Test {
        public static void main(String[] args) {
//            Random random = new Random();
//            StringBuilder stringBuilder = new StringBuilder();
//            // 随机生成一个ASCII值为48-57和65-90的字符
//            for (int i = 0; i < 4; i++) {
//                int randomAscii = random.nextInt(26) + 48; // ASCII值为48-57的数字
//                char randomChar = (char) randomAscii;
//                stringBuilder.append(randomChar);
//            }
//            String randomString = stringBuilder.toString();
//            System.out.println(randomString);

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
