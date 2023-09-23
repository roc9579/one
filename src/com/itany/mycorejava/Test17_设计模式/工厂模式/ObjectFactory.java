package com.itany.mycorejava.Test17_设计模式.工厂模式;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 黄鹏程
 * @date 2023年09月18日16:12
 */
public class ObjectFactory {
    private static Map<String,Object> objs;
    static {
        objs=new HashMap<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(ObjectFactory.class.getClassLoader().getResourceAsStream("objs.properties")));

    }
}
