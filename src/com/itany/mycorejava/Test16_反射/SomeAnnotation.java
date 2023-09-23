package com.itany.mycorejava.Test16_反射;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 黄鹏程
 * @date 2023年09月18日10:11
 */

@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SomeAnnotation {
    String[] value() default {"hello","world"};
    String name() default "admin";
    int age() default 19;
}
