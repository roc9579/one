package com.itany.mycorejava.Test09_集合.map;

import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

/**
 * @author 黄鹏程
 * @date 2023年08月30日14:21
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(
                Test04.class
                    .getClassLoader()
                    .getResourceAsStream("set.properties")
        );
        System.out.println(properties);
        Collection<Object> values = properties.values();

    }
}
