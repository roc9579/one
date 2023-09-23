package com.itany.mycorejava.Test09_集合.list;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author 黄鹏程
 * @date 2023年08月29日10:50
 */
public class Test07 {
    public static void main(String[] args) {
        Vector<Integer> list=new Vector<>(Arrays.asList(1,2,3,4,5,6,7));
        Iterator it =list.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }

        for (Integer nums :list){
            System.out.print(nums);
        }

        Enumeration<Integer> en =list.elements();
        while (en.hasMoreElements()){
            System.out.print(en.nextElement());
        }


    }
}
