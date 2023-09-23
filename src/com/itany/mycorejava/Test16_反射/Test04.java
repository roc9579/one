package com.itany.mycorejava.Test16_反射;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author 黄鹏程
 * @date 2023年09月18日10:19
 */
public class Test04 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class c=Student.class;
        Annotation annotation = c.getAnnotation(SomeAnnotation.class);
        if (annotation instanceof Annotation){
            SomeAnnotation someAnnotation= (SomeAnnotation) annotation;
            System.out.println(Arrays.toString(someAnnotation.value()));
        }

        Field nameField = c.getDeclaredField("name");
        Annotation annotation1 = nameField.getAnnotation(SomeAnnotation.class);
        if (annotation1 instanceof Annotation){
            SomeAnnotation someAnnotation= (SomeAnnotation) annotation1;
            someAnnotation.name();
        }
    }
}
