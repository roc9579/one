package com.itany.mycorejava.homework.黄鹏程;

/**
 * @author 黄鹏程
 * @date 2023年08月14日18:30
 */
public class Test {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            System.out.println(i);
            for (int j=1;j<=3;j++){
                if(j==3){
                    break;
                }
                System.out.println("\t"+j);
            }
        }
    }
}
