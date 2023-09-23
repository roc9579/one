package com.itany.mycorejava.util;

/**
 * @author 黄鹏程
 * @date 2023年09月13日09:43
 */
public class ParameterUtil {

    public static String escapeString(String s){
        char[] chars=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(char c:chars){
            sb.append("/"+c);
        }
        return sb.toString();
    }
}
