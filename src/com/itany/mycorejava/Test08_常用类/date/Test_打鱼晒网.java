package com.itany.mycorejava.Test08_常用类.date;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月25日13:30
 */
public class Test_打鱼晒网 {
    public static void main(String[] args) throws ParseException {
        // 中国有句俗话叫做:三天打渔两天晒网。假设从2000年1月1日开始执行三天打渔两天晒网
        // 在控制台输入一个日期格式的字符串,格式为:yyyy-MM-dd,判断这一天是打渔还是晒网
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个格式为:yyyy-MM-dd的字符串");
        String s = sc.next();
        String bs = "2000-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(bs);
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(s);
        int i = (int) ((date1.getTime() - date.getTime()) / (24 * 60 * 60 * 1000));
        if (i % 5 == 3 || i % 5 == 4) {
            System.out.println("晒网");
        } else if (i % 5 == 1 || i % 5 == 2 || i % 5 == 0) {
            System.out.println("打鱼");
        }else {
            System.out.println("您输入的有误");
        }
    }
}
