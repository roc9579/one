package com.itany.mycorejava.Test07_面向对象.多态;

import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月18日10:51
 */
public class Lx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入宠物名");
        String dong=sc.next();
        Pet pet1=new Dog("alice","gong",18);
        pet1.show();
        if(dong=="狗"){
            Dog pet=new Dog("alice","gong",18);
            pet.show();
        }else if(dong=="猫"){
            Cat pet=new Cat("alice","gong","hei");
            pet.show();
        }else if(dong=="猪"){
            Pig pet=new Pig("alice","gong","chi");
            pet.show();
        }else{
            System.out.println(666);
        }


    }
}

class Pet{
    private String name;
    private String gender;


    public Pet(String name,String gender){
        this.name=name;
        this.gender=gender;
    }

    public void show(){
        System.out.println(name+gender);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}

class Dog extends Pet{
    private int age;

    public Dog(String name,String gender,int age){
        super(name,gender);
        this.age=age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show(){
        System.out.println(getName()+getGender()+age);
    }
}

class Cat extends Pet{
    private String type;

    public Cat(String name,String gender,String type){
        super(name,gender);
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void show(){
        System.out.println(getName()+getGender()+type);
    }
}
class Pig extends Pet{
    private String hobby;

    public Pig(String name,String gender,String hobby){
        super(name,gender);
        this.hobby=hobby;
    }

    public void setType(String type) {
        this.hobby=hobby;
    }

    public String getType() {
        return hobby;
    }

    public void show(){
        System.out.println(getName()+getGender()+hobby);
    }
}