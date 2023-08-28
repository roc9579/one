package com.itany.mycorejava.Test08_常用类.obj;

/**
 * @author 黄鹏程
 * @date 2023年08月22日15:16
 */
public class TestPerson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person();
        Person person1=new Man();
        Person person2=new WoMan();
        Person person4=new BigMan();
        System.out.println(person4 instanceof Man);
        System.out.println(person1 instanceof BigMan);
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person4.hashCode());
//        BigMan bigMan=(BigMan) person1;
//        Man man1=(Man) person4;
//        System.out.println(person1.getClass());
//        System.out.println(Man.class);
//        System.out.println(person1 instanceof Man);
//        System.out.println(person1 instanceof WoMan);
//        System.out.println(person instanceof Man);
//        System.out.println(person instanceof WoMan);
//        System.out.println(person2 instanceof Man);
//        System.out.println(person2 instanceof WoMan);
//        Man man=(Man)person1;
//        man.work();
//        Person person3=new Person("alic",18);
//        System.out.println(person3.toString());
//        System.out.println(person3.hashCode());
//        System.out.println(person3.equals(person2));
        Person person3=new Person("alice",17);
        person3.clone();
        System.out.println(person3.toString());
        System.out.println(person3.clone().toString());
    }

}
