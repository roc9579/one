package com.itany.mycorejava.code03;

/**
 * @author 黄鹏程
 * @date 2023年08月11日14:10
 */
public class Test08_九九乘法表 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }



    }
}
