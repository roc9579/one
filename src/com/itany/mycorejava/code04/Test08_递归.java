package com.itany.mycorejava.code04;

/**
 * @author 黄鹏程
 * @date 2023年08月12日16:01
 */
public class Test08_递归 {

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(Math.pow(0,2));
    }

    public static int sum(int n){
        if(n==1 || n==2){
            return 1;
        }
        return sum(n-1)+sum(n-2);
    }

}
