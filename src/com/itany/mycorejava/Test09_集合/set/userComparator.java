package com.itany.mycorejava.Test09_集合.set;

import java.util.Comparator;

/**
 * @author 黄鹏程
 * @date 2023年08月29日16:18
 */
public class userComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge()>o2.getAge()){
            return -1;
        }else if (o1.getAge()<o2.getAge()){
            return 1;
        }else {
            return 0;
        }
    }
}
