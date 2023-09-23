package com.itany.mycorejava.Test09_集合.map;

import java.util.*;

/**
 * @author 黄鹏程
 * @date 2023年08月30日13:43
 */
public class Test03 {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("id","1");
        properties.setProperty("name","jack");
        properties.setProperty("sex","nv");

        //1
        Set<Object> keys=properties.keySet();
        for (Object key:keys){
            System.out.print(key+"-"+properties.get(key)+"\t");
        }
        System.out.println();

        //2
        Collection<Object> values=properties.values();
        for (Object value:values){
            System.out.print(value+"\t");
        }
        System.out.println();

        //3
        Set<Map.Entry<Object,Object>> entries=properties.entrySet();
        Iterator<Map.Entry<Object,Object>> it=entries.iterator();
        while (it.hasNext()){
            Map.Entry<Object,Object> entry=it.next();
            Object key=entry.getKey();
            Object value=entry.getValue();
            System.out.print(key+"-"+value+"\t");
        }
        System.out.println();

        //4
        Enumeration<Object> keys1=properties.keys();
        while (keys1.hasMoreElements()){
            Object key=keys1.nextElement();
            Object value=properties.getProperty((String) key);
            System.out.print(key+"-"+value+"\t");

        }
        System.out.println();

        //5
        Enumeration<Object> values1=properties.elements();
        while (values1.hasMoreElements()){
            Object value=values1.nextElement();
            System.out.print(value+"\t");
        }
    }
}
