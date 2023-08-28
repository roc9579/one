package com.itany.mycorejava.Test08_常用类.内部类;

/**
 * @author 黄鹏程
 * @date 2023年08月28日11:44
 */
public class Test02 {
    public static void main(String[] args) {
        Out1 out1=new Out1();
        out1.in();
    }
}
class Out1{
    private String name="out";
    private int age=10;

    public void in(){
        int i=123;
        class In1{
            private String name="in";
            private String sex="nv";

            public void show(){
                System.out.println(i);
                //i=100;
            }
        }
        In1 in1 =new In1();
        System.out.println(in1.sex);
        in1.show();
    }
    public void test(){
        //In1 in1 =new In1();
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
