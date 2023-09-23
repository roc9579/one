package com.itany.mycorejava.Test09_集合.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 黄鹏程
 * @date 2023年08月29日16:15
 */
public class Test05 {
    public static void main(String[] args) {
        User user=new User("jack",18);
        User user1=new User("jack",18);
        User user2=new User("tom",17);
        Set<User> users=new TreeSet(new userComparator());
        users.add(user);
        users.add(user1);
        users.add(user2);
        System.out.println(users);
    }
}
