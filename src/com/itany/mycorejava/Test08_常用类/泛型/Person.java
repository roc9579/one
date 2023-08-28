package com.itany.mycorejava.Test08_常用类.泛型;

/**
 * @author 黄鹏程
 * @date 2023年08月25日15:15
 */
public class Person implements CompareInterface<Person> {
    private String name;
    private int age;

    public int Compareto(Person person) {
        if (this.age<person.age){
            return 1;
        }
        return 0;
    }
    public int Compareto(int i) {
        if (this.age<i){
            return 1;
        }
        return 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
