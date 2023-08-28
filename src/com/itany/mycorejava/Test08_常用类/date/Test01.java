package com.itany.mycorejava.Test08_常用类.date;

import java.util.Date;

/**
 * @author 黄鹏程
 * @date 2023年08月24日16:04
 */
public class Test01 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

        Date date1=new Date(0);
        System.out.println(date1);

        System.out.println(date.getTime());
        System.out.println(date1.getTime());

        Date date2=new Date(date.getTime());
        System.out.println(date2);
        date1.setTime(date2.getTime()+24*60*60*1000);
        System.out.println(date1);
        Date date3=new Date(date2.getTime()-24*60*60*1000);

        System.out.println(date1.after(date3));
        System.out.println(date2.after(date3));

        System.out.println(date1.before(date3));
        System.out.println(date2.before(date3));

        System.out.println(date1.compareTo(date3));
        System.out.println(date3.compareTo(date2));
    }
}
