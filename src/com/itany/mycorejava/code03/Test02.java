package com.itany.mycorejava.code03;

/**
 * @author 黄鹏程
 * @date 2023年08月11日10:16
 */
public class Test02 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        do {
            if (i % 7 == 0 && i % 4 != 0) {
                if ((count + 1) % 5 == 0) {
                    System.out.println(i);
                    count += 1;
                } else {
                    System.out.print(i + "\t");
                    count += 1;
                }
            }
            i++;
        } while (i <= 200);
        System.out.println("\n"+count);
    }
}
