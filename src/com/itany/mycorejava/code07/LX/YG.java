package com.itany.mycorejava.code07.LX;

/**
 * @author 黄鹏程
 * @date 2023年08月17日11:21
 */
public class YG {

    private String name;
    private double money;
    private String sex;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setMoney(double money){
        this.money=money;
    }
    public YG(){

    }
    public YG(String sex){
        this.sex=sex;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public double getMoney(){
        return money;
    }
    public String getSex(){
        return sex;
    }
    public int getAge(){
        if(age<18){
            return 18;
        }
        return age;
    }

    public void zwjs(){
        System.out.println("我叫"+getName()+",我的工资是"+getMoney()+"，性别："+getSex()+"，年龄："+getAge());
    }

}
