package com.itany.mycorejava.Test16_反射;

import java.lang.reflect.Modifier;

/**
 * @author 黄鹏程
 * @date 2023年09月15日14:15
 */
public class Test02 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class c1=User.class;
        System.out.println(c1.getName());

        System.out.println(c1.getSimpleName());
        System.out.println(c1.getInterfaces());
        System.out.println(c1.getSuperclass());
        System.out.println(c1.getPackage());
        System.out.println(c1.isInterface());
        System.out.println(c1.getModifiers());
        System.out.println(Modifier.toString(c1.getModifiers()));
        Object obj=c1.newInstance();
        System.out.println(obj.getClass());
    }
}
