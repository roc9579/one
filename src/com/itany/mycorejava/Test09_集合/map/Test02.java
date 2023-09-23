package com.itany.mycorejava.Test09_集合.map;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * @author 黄鹏程
 * @date 2023年08月30日11:33
 */
public class Test02 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"66");
        map.put(2,"777");
        map.put(3,"333");
        //1
        Set<Integer> keys =map.keySet();
        for (Integer key : keys){
            System.out.print(key+"-"+map.get(key)+" ");
        }
        System.out.println();
        //2
        Collection<String> values=map.values();
        for (String value:values){
            System.out.print(value);
        }
        System.out.println();
        //3

        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        Iterator<Map.Entry<Integer,String>> it =entries.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entry=it.next();
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"-"+value);
        }
    }
}
