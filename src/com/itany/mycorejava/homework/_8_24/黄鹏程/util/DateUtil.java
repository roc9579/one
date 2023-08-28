package com.itany.mycorejava.homework._8_24.黄鹏程.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


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
        DateFormat df=new SimpleDateFormat(pattern);
        String result=df.format(date);
        return result;
    }


    /**
     * 将日期格式转换成字符串格式
     * 此时转换后的日期格式使用默认格式
     * @param date 需要转换的日期值
     * @return
     * @see DateConstant
     */
    public static String toString(Date date) {
        DateFormat df=new SimpleDateFormat(DateConstant.DATE_DEFAULT_PATTERN);
        String result=df.format(date);
        return result;
    }

    /**
     * 将一个指定格式的字符串转换成日期
     * @param s       需要转换的字符串
     * @param pattern 指定字符串的格式
     * @return
     */
    public static Date toDate(String s, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = sdf.parse(s);
        return date;
    }

    /**
     * 使用默认格式将一个字符串转换成日期
     * @param s 需要转换的字符串
     * @return
     * @see DateConstant
     */
    public static Date toDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateConstant.DATE_DEFAULT_PATTERN);
        Date date = sdf.parse(s);
        return date;
    }

    /**
     * 获取指定日期的前一天
     * @param date 指定日期
     * @return
     */
    public static Date getYesterday(Date date) {
        date.setTime(date.getTime()-24*60*60*1000);
        return date;
    }

    /**
     * 获取指定日期的下一天
     * @param date 指定日期
     * @return
     */
    public static Date getTomorrow(Date date) {
        date.setTime(date.getTime()+24*60*60*1000);
        return date;
    }

    /**
     * 计算两个日期之间相差的天数
     * @param startDay 开始日期
     * @param endDate  结束日期
     * @return
     */
    public static int getDuringDay(Date startDay, Date endDate) {
        int day= (int) ((endDate.getTime()-startDay.getTime())/(24*60*60*1000));
        return day;
    }

    /**
     * 获取日期中指定的年、月、日、时、分、秒的值
     * @param date  指定日期
     * @param field 指定需要获取哪一部分的值
     * @return
     */
    public static int get(Date date, int field) {
        DateFormat df=new SimpleDateFormat(DateConstant.DATE_DEFAULT_PATTERN);
        String result=df.format(date);
        String[] sarr =result.split("[-\\s:]");
        if (field==DateConstant.YEAR){
            String s=sarr[0];
            return Integer.parseInt(s);
        }else if (field==DateConstant.MONTH){
            String s=sarr[1];
            return Integer.parseInt(s);
        }else if (field==DateConstant.DAY){
            String s=sarr[2];
            return Integer.parseInt(s);
        }else if (field==DateConstant.HOURS){
            String s=sarr[3];
            return Integer.parseInt(s);
        }else if (field==DateConstant.MINUTE){
            String s=sarr[4];
            return Integer.parseInt(s);
        }else {
            String s=sarr[5];
            return Integer.parseInt(s);
        }

    }
}
