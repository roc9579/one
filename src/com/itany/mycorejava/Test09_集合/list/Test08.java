package com.itany.mycorejava.Test09_集合.list;

import java.util.Stack;

/**
 * @author 黄鹏程
 * @date 2023年08月29日11:40
 */
public class Test08 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.add(6);
        System.out.println(stack);

        System.out.println(stack.push(7));
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
