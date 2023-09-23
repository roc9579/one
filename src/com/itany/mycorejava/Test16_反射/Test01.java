package com.itany.mycorejava.Test16_反射;

/**
 * @author 黄鹏程
 * @date 2023年09月15日13:52
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        User user=new User();
        Class c1=User.class;
        Class c2=user.getClass();
        Class c3=Class.forName("com.itany.mycorejava.Test16_反射.User");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1==c2);
        System.out.println(c3==c2);
        User user1=new User();
    }
}
