package com.itany.mycorejava.Test17_设计模式.代理模式.静态代理;

/**
 * @author 黄鹏程
 * @date 2023年09月18日17:04
 */
public class UserServiceProxy implements UserService{
    private UserServiceIml userServiceIml=new UserServiceIml();
    @Override
    public void login(String username, String password) {
        System.out.println(7);
        userServiceIml.login("admin", "12345");
        System.out.println(8);
    }

    @Override
    public void register(String username, String password) {
        System.out.println(7);
        userServiceIml.register("admin","12345");
        System.out.println(8);
    }
}
