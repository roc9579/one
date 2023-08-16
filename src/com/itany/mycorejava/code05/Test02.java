package com.itany.mycorejava.code05;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月14日14:16
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入有几名学生");
        int num =sc.nextInt();
        String[] name = new String[num];
        for (int i=0;i< name.length;i++){
            System.out.print("请输入第"+(i+1)+"个学生的名字");
            name[i]=sc.next();
        }
        for (int i=0;i<name.length;i++){
            System.out.print(name[i]+"\t");
        }
        System.out.println();
        for (String names :name){
            System.out.print(names+"\t");
        }
        System.out.println(name[3]);
    }
}
