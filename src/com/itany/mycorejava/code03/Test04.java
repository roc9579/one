package com.itany.mycorejava.code03;

/**
 * @author 黄鹏程
 * @date 2023年08月11日10:53
 */
public class Test04 {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int g=i%10;
            int s=(i/10)%10;
            int b=i/100;
            if(i==g*g*g+s*s*s+b*b*b){
                System.out.println(i);
            }
        }
    }
}
