package com.itany.mycorejava.Test16_反射;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @author 黄鹏程
 * @date 2023年09月18日11:30
 */
public class EmpUntil {
    private static Properties p;
    static {
        p=new Properties();
        try {
            p.load(EmpUntil.class.getClassLoader().getResourceAsStream("emp.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Emp getEmp(){
        Class<Emp> c=Emp.class;
        try {
            Emp emp=c.newInstance();
            Field[] fields=c.getDeclaredFields();
            for (Field f:fields){
                Value annotation = f.getAnnotation(Value.class);
                f.setAccessible(true);
                f.set(emp,p.getProperty(annotation.value()));
            }
            return emp;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
