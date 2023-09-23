package com.itany.mycorejava.Test09_集合.list;

import java.util.ArrayList;

/**
 * @author 黄鹏程
 * @date 2023年08月28日14:58
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("666");
        arrayList.add("777");
        arrayList.add("admin");
        arrayList.add("pow");
        arrayList.add("jack");
        System.out.println(arrayList);
        arrayList.add(1,"888");
        System.out.println(arrayList);

        System.out.println(arrayList.set(1,"999"));
        System.out.println(arrayList);

        System.out.println(arrayList.remove("666"));
        System.out.println(arrayList);

        System.out.println(arrayList.remove(2));
        System.out.println(arrayList);

        System.out.println(arrayList.get(3));
        System.out.println(arrayList.indexOf("pow"));
        System.out.println(arrayList.lastIndexOf("pow"));

        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("666"));
    }
}
