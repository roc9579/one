package com.itany.mycorejava.Test09_集合.set;

/**
 * @author 黄鹏程
 * @date 2023年08月29日16:16
 */
class User implements Comparable<User> {
    private String name;
    private int age;

    public User() {
    }

    @Override
    public int compareTo(User user) {
        if (this.age > user.getAge()) {
            return 1;
        } else if (this.age < user.getAge()) {
            return -1;
        } else {
            if (this.name.length() > user.getName().length()) {
                return 1;
            } else if (this.name.length() < user.getName().length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
