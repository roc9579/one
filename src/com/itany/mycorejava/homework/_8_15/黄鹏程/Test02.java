package com.itany.mycorejava.homework._8_15.黄鹏程;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月15日14:09
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数");
        int rows=sc.nextInt();
        int[][] arr=new int[rows][rows];
        int minX=0,maxX=rows-1,minY=0,maxY=rows-1;
        int count=1;
        while(minX<=maxX){
            for (int x=minX;x<=maxX;x++){
                arr[minY][x]=count++;
            }
            minY++;
            for (int y=minY;y<=maxY;y++){
                arr[y][maxX]=count++;
            }
            maxX--;
            for (int x=maxX;x>=minX;x--){
                arr[maxY][x]=count++;
            }
            maxY--;
            for (int y=maxY;y>=minY;y--){
                arr[y][minX]=count++;
            }
            minX++;
        }
        for (int i=0;i<rows;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
