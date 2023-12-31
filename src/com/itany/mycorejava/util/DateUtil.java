package com.itany.mycorejava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 黄鹏程
 * @date 2023年08月24日 16:53
 * 日期工具类
 */
public class DateUtil {

    /**
     * 将日期格式转换成字符串格式
     * @param date    需要转换的日期值
     * @param pattern 转换后的字符串格式
     * @return
     */
    public static String toString(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }


    /**
     * 将日期格式转换成字符串格式
     * 此时转换后的日期格式使用默认格式
     * @param date 需要转换的日期值
     * @return
     * @see DateConstant
     */
    public static String toString(Date date) {
        return toString(date, DateConstant.DATE_DEFAULT_PATTERN);
    }

    /**
     * 将一个指定格式的字符串转换成日期
     * @param s       需要转换的字符串
     * @param pattern 指定字符串的格式
     * @return
     */
    public static Date toDate(String s, String pattern) throws ParseException {
        return new SimpleDateFormat(pattern).parse(s);
    }

    /**
     * 使用默认格式将一个字符串转换成日期
     * @param s 需要转换的字符串
     * @return
     * @see DateConstant
     */
    public static Date toDate(String s) throws ParseException {
        return toDate(s, DateConstant.DATE_DEFAULT_PATTERN);
    }

    /**
     * 获取指定日期的前一天
     * @param date 指定日期
     * @return
     */
    public static Date getYesterday(Date date) {
        return new Date(date.getTime() - DateConstant.ONE_DAY_MILLISECOND);
    }

    /**
     * 获取指定日期的下一天
     * @param date 指定日期
     * @return
     */
    public static Date getTomorrow(Date date) {
        return new Date(date.getTime() + DateConstant.ONE_DAY_MILLISECOND);
    }

    /**
     * 计算两个日期之间相差的天数
     * @param startDay 开始日期
     * @param endDate  结束日期
     * @return
     */
    public static int getDuringDay(Date startDay, Date endDate) {

        long time = endDate.getTime() - startDay.getTime();

        int day = (int) (time / DateConstant.ONE_DAY_MILLISECOND);
        return day;
    }

    /**
     * 获取日期中指定的年、月、日、时、分、秒的值
     * @param date  指定日期
     * @param field 指定需要获取哪一部分的值
     * @return
     */
    public static int get(Date date, int field) {

        String s = toString(date);

        String[] arr = s.split("[-\\s:]");

        return Integer.parseInt(arr[field]);
    }


    // 根据指定的年份year与月份month获取year年month月共有多少天
    public static int getDay(int year,int month){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        return calendar.getActualMaximum(Calendar.DATE);
    }

    // 根据指定的年份year与月份month获取year年month月共有多少天
    public static int getDay1(int year,int month){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.DATE,31);
        if (calendar.get(Calendar.DATE)==31){
            return calendar.get(Calendar.DATE);
        }else if (calendar.get(Calendar.DATE)==1){
            return 30;
        }else if (calendar.get(Calendar.DATE)==2){
            return 29;
        }else{
            return 28;
        }
    }
}
