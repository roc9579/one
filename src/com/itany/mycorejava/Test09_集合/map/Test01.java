package com.itany.mycorejava.Test09_集合.map;

import java.util.*;

/**
 * @author 黄鹏程
 * @date 2023年08月30日10:23
 */
public class Test01 {
    public static void main(String[] args) {
        // 控制台输入一个字符串,统计字符串中每个字符出现的次数,保存到HashMap集合中
        // 至少使用两种不同的方式实现

        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串");
        String s=sc.next();
        char[] cs=s.toCharArray();
        List<Character> list=new ArrayList<>();
        for (int i=0;i<cs.length;i++){
            Character c=cs[i];
            list.add(c);
        }
        Map<Character,Integer> map=new HashMap<>();
        for (Character c:list){
            int count=0;
            for (Character c1:list){
                if (c1==c){
                    count++;
                }
            }
            map.put(c,count);
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            System.out.print(key + "-" + map.get(key) + " ");
        }


    }
}
