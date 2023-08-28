package com.itany.mycorejava.Test08_常用类.calendar;

import com.itany.mycorejava.util.DateUtil;

import java.util.Calendar;

import java.util.Date;

/**
 * @author 黄鹏程
 * @date 2023年08月25日10:37
 */
public class Test01 {
    public static void main(String[] args) {
//        Calendar calendar=Calendar.getInstance();
//        Date date=calendar.getTime();
//        System.out.println(DateUtil.toString(date));
//
//        calendar.setTime(DateUtil.getTomorrow(date));
//        System.out.println(DateUtil.toString(calendar.getTime()));
//
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH)+1);
//
//        calendar.set(Calendar.YEAR,2026);
//        System.out.println(DateUtil.toString(calendar.getTime()));
//        calendar.add(Calendar.YEAR,1);
//        System.out.println(DateUtil.toString(calendar.getTime()));
//
//        System.out.println(DateUtil.toString(new Date(calendar.getTimeInMillis())));

        System.out.println(DateUtil.getDay(2024,2));
    }
}
