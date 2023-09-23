package com.itany.mycorejava.Test17_设计模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 黄鹏程
 * @date 2023年09月19日09:32
 */
public class LogInvocationHandler implements InvocationHandler {
    private Object object;
    public LogInvocationHandler(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(6);
        Object result= method.invoke(object,args);
        System.out.println(6);
        return result;
    }
}
