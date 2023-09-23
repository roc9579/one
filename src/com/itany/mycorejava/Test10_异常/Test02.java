package com.itany.mycorejava.Test10_异常;

/**
 * @author 黄鹏程
 * @date 2023年08月31日09:26
 */
public class Test02 {
    public static void main(String[] args) {
        try {
            show("admin");
        } catch (Usernameexit usernameexit) {
            System.err.println("用户名重复");
        }
    }
    public static void show(String name){
        if (name.equals("admin")){
            throw new Usernameexit("666");
        }
    }
}
