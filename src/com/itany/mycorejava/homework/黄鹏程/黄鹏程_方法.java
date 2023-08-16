package com.itany.mycorejava.homework.黄鹏程;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月11日16:06
 */
public class 黄鹏程_方法 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入n");
        int n =sc.nextInt();
        sum(n);

        System.out.print("请输入n");
        int n1=sc.nextInt();
        System.out.print("请输入num1");
        int num1=sc.nextInt();
        System.out.print("请输入num2");
        int num2=sc.nextInt();
        sum1(n1,num1,num2);

        System.out.print("请输入x");
        double x=sc.nextDouble();
        System.out.print("请输入y");
        double y=sc.nextDouble();
        cf(x,y);
    }
    public static int sum(int n){
        int sum=0;
        if(n%2==0){
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    sum+=i;
                }
            }
        }else{
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    sum+=i;
                }
            }
        }
        return sum;
    }
    public static int sum1(int n,int num1,int num2){
        int sum1=0;
        for(int i=1;i<=n;i++){
            if(i%num1==0&&i%num2==0){
                sum1+=i;
            }
        }
        return sum1;
    }
    public static double cf(double x,double y){
        double cj=1;
        if(x==0){
            cj=0;
        }else {
            if(y>0){
                for(int i=1;i<=y;i++){
                    cj*=x;
                }
            } else if (y==0) {
                cj=1;
            } else {
                for (int i=-1;i>=y;i--){
                    cj=cj*x;
                }
                cj=1/cj;
            }
        }

        return cj;
    }
}
