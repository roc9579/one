package com.itany.mycorejava.code07;

/**
 * @author 黄鹏程
 * @date 2023年08月17日16:11
 */
public class Person {
    private String name;
    private String sex;

    public void setName(String name){
        this.name=name;
    }
    public void setSex(String sex){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public void test(){
        System.out.println("父");
    }
}

class Man extends Person {
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }



}
class Test000{
    public static void main(String[] args) {
        Man man=new Man();
        man.test();
    }

}
