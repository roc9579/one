package com.itany.mycorejava.Test09_集合.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author 黄鹏程
 * @date 2023年08月29日11:47
 */
// 定义一个用户类User,属性:id、name、age,实现以下功能,每个功能一个方法
// 1.添加用户信息,提示用户循环输入用户的信息,存储到ArrayList集合中
// 2.查询所有用户信息,输出集合中所有用户的信息
// 3.根据编号查询指定用户信息
// 4.根据编号修改指定用户信息
// 5.根据编号删除指定用户信息
public class Test09 {
    public static void main(String[] args) {
        User.menu();
    }
}

class User{
    private String id;
    private String name;
    private int age;

    static Scanner sc=new Scanner(System.in);
    static ArrayList<User> users=new ArrayList<>();

    public static void menu(){
        System.out.print("请输入选项：1，录入信息 2，查询信息 3，查询用户 4，修改用户 5，删除用户 6,退出");
        int i=sc.nextInt();
        switch (i){
            case 1:
                addUsers();
                menu();
                break;
            case 2:
                findUsers();
                menu();
                break;
            case 3:
                System.out.print("请输入查询编号");
                finduser(sc.next());
                menu();
                break;
            case 4:
                System.out.print("请输入修改编号");
                setUser(sc.next());
                menu();
                break;
            case 5:
                System.out.print("请输入删除编号");
                deleUser(sc.next());
                menu();
                break;
            case 6:
                System.out.println("退出成功");
                break;
            default:
                System.out.println("输入有误，请重新输入");
                menu();
        }
    }

    // 1.添加用户信息,提示用户循环输入用户的信息,存储到ArrayList集合中
    public static void addUsers(){
        System.out.print("请输入用户id");
        String id=sc.next();
        if (users.contains(new User(id,"",0))){
            System.out.println("编号已经存在，请重新输入");
            addUsers();
        }
        System.out.print("请输入用户姓名");
        String name=sc.next();
        System.out.print("请输入用户年龄");
        int age=sc.nextInt();
        User user=new User(id,name,age);
        users.add(user);
        System.out.println("添加成功");
    }

    // 2.查询所有用户信息,输出集合中所有用户的信息
    public static void findUsers(){
        System.out.println(users);
    }

    // 3.根据编号查询指定用户信息
    public static User finduser(String id){
        Iterator<User> it = users.iterator();
        while (it.hasNext()){
            User user=it.next();
            if (user.getId().equals(id)){
                System.out.println(user);
                return user;
            }
        }
        System.out.println("未查询到信息");
        return null;
    }

    // 4.根据编号修改指定用户信息
    public static Boolean setUser(String id){
        for (int i=0;i<users.size();i++){
            User user=new User();
            user=users.get(i);
            if (user.getId().equals(id)){
                System.out.print("请输入要修改的姓名");
                users.get(i).setName(sc.next());
                System.out.print("请输入要修改的年龄");
                users.get(i).setAge(sc.nextInt());
                System.out.println("修改成功");
                return true;
            }
        }
        System.out.println("未找到用户");
        return false;
    }


    // 5.根据编号删除指定用户信息
    public static Boolean deleUser(String id){
        Iterator<User> it = users.iterator();
        while (it.hasNext()){
            User user=it.next();
            if (user.getId().equals(id)){
                it.remove();
                System.out.println("删除成功");
                return true;
            }
        }
        System.out.println("未找到用户");
        return false;
    }



    public User() {
    }

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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