package com.itany.mycorejava.homework._8_14.黄鹏程;

import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年08月14日17:04
 */
public class ArrayUtil {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5,1,9)));
    }

    public static int[] createArray(int length, int x, int y){
        int[] createArray= new int[length];
        for (int i=0;i<length;i++){
            createArray[i]=(int)(Math.random()*(y-x+1)+x);
            if(i>=1){
                for (int j=0;j<i;j++){
                    if(createArray[i]==createArray[j]){
                        i=i-1;
                        break;
                    }
                }
            }
        }
        return createArray;
    }

    public static void copyArray(int[] src, int[] dist){
        for (int i=0;i<src.length;i++){
            dist[i]=src[i];
        }
    }

    public static void show(int[] arr){
        for (int i=0;i< arr.length;i++){
            if (i< arr.length-1){
                System.out.print(arr[i]+"-");
            }else{
                System.out.print(arr[i]);
            }
        }
    }

    public static void change(int[] arr,int i, int j){
        int a=arr[i];
        arr[i]=arr[j];
        arr[j]=a;
    }

    public static void reverse(int[] arr){
        for (int i=0;i< arr.length/2;i++){
            int a=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=a;
        }
    }

}
