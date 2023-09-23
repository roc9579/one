package com.itany.mycorejava.Test17_设计模式.代理模式.静态代理;

/**
 * @author 黄鹏程
 * @date 2023年09月18日16:59
 */
public interface UserService {
    void login(String username,String password);
    void register(String username,String password);
}
