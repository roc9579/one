package com.itany.mycorejava.entity;

import java.util.Date;

/**
 * @author 黄鹏程
 * @date 2023年09月18日16:03
 */
public class User{
    private String name;
    private Date date;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
