package com.itany.mycorejava.Test09_集合.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月28日16:24
 */
public class Test04 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // 循环提示用户输入一个整数,存放到ArrayList集合中,输入0表示循环结束
        // 删除所有是3的倍数的元素
        //lx();
        //lx2();
    }

    public static void lx(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (true){
            System.out.print("请输入一个整数");
            int i=sc.nextInt();
            if (i==0){
                break;
            }
            arrayList.add(i);
        }
        System.out.println(arrayList);
        for (int i=arrayList.size()-1;i>=0;i--){
            Integer num= arrayList.get(i);
            if (num%3==0){
                arrayList.remove(new Integer(num));
            }
        }
        System.out.println(arrayList);
    }

    public static void lx2(){
        List<Integer> arrayList=new ArrayList<>();
        while (true){
            System.out.print("请输入一个整数");
            int i=sc.nextInt();
            if (i==0){
                break;
            }
            arrayList.add(i);
        }
        System.out.println(arrayList);
        Iterator<Integer> it= arrayList.iterator();
        while (it.hasNext()){
            Integer num = it.next();
            if (num%3==0){
                it.remove();
            }
        }
        System.out.println(arrayList);
    }
}
