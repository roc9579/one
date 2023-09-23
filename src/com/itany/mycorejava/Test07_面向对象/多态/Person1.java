package com.itany.mycorejava.Test07_面向对象.多态;

/**
 * @author 黄鹏程
 * @date 2023年08月20日19:49
 */

public class Person1 {
    private String name;
    private int age;
    // get/set方法

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("姓名:" + name + ",年龄:" + age);
    }

}

class Man1 extends Person1 {
    private double salary;
    // get/set方法


    public Man1() {
        super("name",19);
    }

    public Man1(String name, int age) {
        super(name, age);
    }
    public void show() {
        System.out.println("我是一个男人,我的姓名:" + super.getName() + ",今年" + super.getAge() + "岁,工资:" + salary);
    }

    public void work() {
        System.out.println("我是一个男人,我需要工作用于养家糊口");
    }
}

class WoMan1 extends Person1 {
    private int appearance;
    // get/set方法
    public WoMan1(String name, int age) {
        super(name, age);
    }

    public void show() {
        System.out.println("我是一个女人,我的姓名:" + super.getName() + ",今年" + super.getAge() + "岁,颜值:" + appearance);
    }

    public void shopping() {
        System.out.println("我是一个女人,我的颜值可以达到" + appearance + "分,我只需要负责貌美如花,没事逛逛街,购购物");
    }
}

class TestPerson {
    public static void main(String[] args) {
        // 对象的多态性,父类Person的引用指向了子类Man的对象
        // 此时的Person是编译时类型,Man是运行时类型
        // 此时的Person是Man的父类
        // 这种向上转型,会进行自动类型转换
        Person1 person = new Man1("admin", 18);
        // 运行时该对象的类型是Man
        //System.out.println(person);
        // 调用的方法最终执行的也是子类的方法
        //person.show();

        // 此时由于对象引用属于父类的引用
        // 因此,编译时的类型本质上就是父类
        // 只能调用父类中的方法,不能直接调用子类的方法
        // person.work(); // 报错
        // 如果想要调用子类方法,必须以子类的类型去执行
        // 即:需要将其转换成子类去执行
        Man1 man = (Man1) person;
        man.work();
        if (person instanceof Man1) {
            Man1 man1 = (Man1) person;
            man.work();
        } else {
            System.out.println("person无法转换成Man");
        }
        if (person instanceof WoMan1) {
            WoMan1 woMan = (WoMan1) person;
            woMan.shopping();
        } else {
            System.out.println("person无法转换成WoMan");
        }
    }
}