package com.itany.mycorejava.Test16_反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年09月15日15:00
 */
public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c=User.class;
        Constructor[] constructors=c.getConstructors();
        System.out.println(Arrays.toString(constructors));

        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));

        Constructor constructor1=c.getConstructor(String.class,String.class);
        System.out.println(constructor1);

        Constructor constructor2=c.getDeclaredConstructor(String.class);
        System.out.println(constructor2);

        User user = (User) constructor1.newInstance("a", "ad");
        constructor2.setAccessible(true);
        User user1 = (User) constructor2.newInstance("a");
    }
}
