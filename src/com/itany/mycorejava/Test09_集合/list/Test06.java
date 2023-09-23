package com.itany.mycorejava.Test09_集合.list;

import java.util.LinkedList;

/**
 * @author 黄鹏程
 * @date 2023年08月29日10:18
 */
public class Test06 {
    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(9);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.pollFirst());
        System.out.println(list);
        System.out.println(list.peekLast());
        System.out.println(list.removeFirst());
        //get---peek
        //remove---poll
    }
}
