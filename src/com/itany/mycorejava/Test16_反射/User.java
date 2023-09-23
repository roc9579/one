package com.itany.mycorejava.Test16_反射;

import java.io.Serializable;

/**
 * @author 黄鹏程
 * @date 2023年09月15日13:51
 */
public class User extends Person implements Serializable {
    private String username;
    private String password;
    private String address;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private User(String username) {
        this.username = username;
    }

    public User(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
