package com.itany.mycorejava.code03;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月11日11:19
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("需要打印几个数");
        int s=sc.nextInt();
        if(s>0){
            if(s==1){
                System.out.println(1);
            }else if(s==2){
                System.out.println(1);
                System.out.println(1);
            }else if(s>2){
                System.out.println(1);
                System.out.println(1);
                int y=1;
                int e=1;
                int sum;
                for(int i=3;i<=s;i++){
                    sum=y+e;
                    y=e;
                    e=sum;
                    System.out.println(sum);
            }
        } else{
            System.out.println("输入有误");
        }

        }
    }
}
