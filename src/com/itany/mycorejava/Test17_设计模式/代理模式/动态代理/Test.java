package com.itany.mycorejava.Test17_设计模式.代理模式.动态代理;

import java.lang.reflect.Proxy;

/**
 * @author 黄鹏程
 * @date 2023年09月19日09:28
 */
public class Test {
    public static void main(String[] args) {
        UserService userService = (UserService) Proxy.newProxyInstance(
                UserServiceIml.class.getClassLoader(),
                UserServiceIml.class.getInterfaces(),
                new LogInvocationHandler(new UserServiceIml())
        );
        userService.login("admin","12345");

    }
}
