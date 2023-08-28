package com.itany.mycorejava.Test08_常用类.内部类;

/**
 * @author 黄鹏程
 * @date 2023年08月28日11:54
 */
public class Test03 {
    public static void main(String[] args) {

    }
}

class Out2{
    private String name="out";
    private int age=10;

    static class In2{
        private String name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}