package com.itany.mycorejava.Test07_面向对象.多态;

/**
 * @author 黄鹏程
 * @date 2023年08月18日10:21
 */
public class Test_测试 {
    public static void main(String[] args) {
        Dongwu don=new Dog1("ww","18");

    }
}

class Dongwu{
    private String name;
    private String age;

    public Dongwu(String name,String age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(""+name+age);
    }


    public void setName(String name){
        this.name=name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public String getAge(){
        return this.age;
    }
}

class Dog1 extends Dongwu{
    private String gongzi;

    public Dog1(String name, String age) {
        super(name, age);
    }

    public void work(){
        System.out.println(""+getGongzi());
    }

    public void setGongzi(String gongzi) {
        this.gongzi = gongzi;
    }
    public String getGongzi() {
        return gongzi;
    }
}