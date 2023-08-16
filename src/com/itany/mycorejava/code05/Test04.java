package com.itany.mycorejava.code05;

import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年08月15日10:23
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr={13,2,34,56,6,19,67,22,14,8};
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
