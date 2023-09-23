package com.itany.mycorejava.Test15_java8新特性;

/**
 * @author 黄鹏程
 * @date 2023年09月15日16:27
 */
public class Dept {

    private Integer id;
    private String name;

    public Dept(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}