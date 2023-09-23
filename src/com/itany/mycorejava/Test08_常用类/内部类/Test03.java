package com.itany.mycorejava.Test08_常用类.内部类;

/**
 * @author 黄鹏程
 * @date 2023年08月28日11:54
 */
public class Test03 {
    public static void main(String[] args) {
        Out2.In2 in2=new Out2.In2();
        in2.show();
    }
}

class Out2{
    private String name="out";
    private int age=10;

    static class In2{
        private String name="in";
        private String sex="nv";

        public void show(){
            System.out.println(777);
            Out2 out2=new Out2();
            out2.show();
        }
    }

    public void show(){
        In2 in2=new In2();
        in2.show();
        System.out.println(666);
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