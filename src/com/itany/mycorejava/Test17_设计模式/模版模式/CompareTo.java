package com.itany.mycorejava.Test17_设计模式.模版模式;

/**
 * @author 黄鹏程
 * @date 2023年09月18日14:55
 */
public class CompareTo {
    public static  <T>void compare(T[] arr,Compare<T> c){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                int res=c.compare(arr[j],arr[j+1]);
                if (res>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
