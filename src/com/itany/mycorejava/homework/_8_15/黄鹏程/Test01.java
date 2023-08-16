package com.itany.mycorejava.homework._8_15.黄鹏程;

import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年08月15日13:51
 */
public class Test01 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {2, 3, 4, 1},
                {3, 4, 1, 2},
                {4, 3, 2, 1},
        };
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        int[] temp = new int[4];
        temp = arr[0];
        arr[0] = arr[3];
        arr[3] = temp;
        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
