package com.itany.mycorejava.Test09_集合.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年08月28日14:18
 */
public class Test01_list {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(3);
        arrayList.add("3");

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("66");
        arrayList1.add("77");

        List<String> arrayList2=new ArrayList<>(arrayList1);
        System.out.println(arrayList2.size());
    }
}
