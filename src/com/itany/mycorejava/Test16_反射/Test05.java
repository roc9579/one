package com.itany.mycorejava.Test16_反射;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @author 黄鹏程
 * @date 2023年09月18日10:41
 */
public class Test05 {
    public static void main(String[] args) throws IOException, NoSuchFieldException {
//        Properties p=new Properties();
//        p.load(Test05.class.getClassLoader().getResourceAsStream("emp.properties"));
//        Class<Emp> c=Emp.class;
//        Emp emp= null;
//        try {
//            emp = c.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        Field idField=c.getDeclaredField("id");
//        Value annotation = idField.getAnnotation(Value.class);
//        String s=annotation.value();
//        emp.setId(Integer.valueOf(p.getProperty(s)));
//        Field nameField=c.getDeclaredField("name");
//        Value annotation1 = nameField.getAnnotation(Value.class);
//        String s1=annotation1.value();
//        emp.setName(p.getProperty(s1));
//        Field salaryField=c.getDeclaredField("salary");
//        Value annotation2 = salaryField.getAnnotation(Value.class);
//        String s2=annotation2.value();
//        emp.setSalary(Double.valueOf(p.getProperty(s2)));
//        System.out.println(emp);
        System.out.println(EmpUntil.getEmp());
    }
}
