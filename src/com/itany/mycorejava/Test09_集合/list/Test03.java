package com.itany.mycorejava.Test09_集合.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年08月28日15:24
 */
public class Test03 {
    public static void main(String[] args) {
        chang();
    }
    public static void chang(){
        ArrayList arrayList=new ArrayList();
        arrayList.add("77");
        arrayList.add(77);
        arrayList.add('1');
        Object[] objects=arrayList.toArray();
        System.out.println(Arrays.toString(objects));
    }
    public static void chang2(){
        String[] str={"88","66","8"};
        List list= Arrays.asList(str);
    }

}
