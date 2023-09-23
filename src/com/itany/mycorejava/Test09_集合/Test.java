package com.itany.mycorejava.Test09_集合;

import java.util.*;

/**
 * @author 黄鹏程
 * @date 2023年08月30日17:12
 */
public class Test {
    public static void main(String[] args) {
        // 控制台输入一个字符串,统计字符串中每个字符出现的次数,保存到HashMap集合中
        // 通过排序,打印输出次数最多的前三个字符及次数
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串");
        String s=sc.nextLine();
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (hashMap.containsKey(s.charAt(i)+"")){
                hashMap.put(s.charAt(i)+"",hashMap.get(s.charAt(i)+"")+1);
            }else{
                hashMap.put(s.charAt(i)+"",1);
            }
        }
        System.out.println(hashMap);
        List<String> list=new ArrayList<>();
        Set<String> keys=hashMap.keySet();
        for (String key:keys){
            String key1=key;
            Integer value1=hashMap.get(key);
            String s1=value1+"="+key1;
            list.add(s1);
        }
        Collections.sort(list);
        System.out.println("出现次数最多的前三个字符及次数：");
        for(int i=list.size()-1;i>=list.size()-3;i--){
            StringBuffer stringBuffer=new StringBuffer(list.get(i));
            stringBuffer.reverse();
            System.out.println(stringBuffer);
        }
    }
}
