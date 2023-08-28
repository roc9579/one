package com.itany.mycorejava.Test08_常用类.内部类;


/**
 * @author 黄鹏程
 * @date 2023年08月28日10:29
 */
public class Test01 {
    public static void main(String[] args) {
        Out out= new Out();
        Out.In in=out.new In();
        System.out.println(in.getName());
        in.show();
        Out.In in1=new Out().new In();
        in1.show();
    }
}

class Out{
    private String name="out";
    private int age=10;

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


    public void show(){
        System.out.println(777);
    }

    class In{
        private String name="in";
        private String sex="nv";


        public void show(){
            System.out.println(666);
            System.out.println(Out.this.name+age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }
}
