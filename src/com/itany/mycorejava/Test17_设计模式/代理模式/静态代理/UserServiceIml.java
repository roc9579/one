package com.itany.mycorejava.Test17_设计模式.代理模式.静态代理;

/**
 * @author 黄鹏程
 * @date 2023年09月18日16:58
 */
public class UserServiceIml implements UserService{

    @Override
    public void login(String username, String password) {
        if ("admin".equals(username)&&"12345".equals(password)){
            System.out.println("6");
        }
    }

    @Override
    public void register(String username, String password) {
        if ("admin".equals(username)&&"12345".equals(password)){
            System.out.println("6");
        }
    }
}
