package com.itany.mycorejava.Test16_反射;

/**
 * @author 黄鹏程
 * @date 2023年09月18日10:40
 */
public class Emp {
    @Value("id")
    private String id;
    @Value("name")
    private String name;
    @Value("salary")
    private String salary;
    // get/set方法

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}