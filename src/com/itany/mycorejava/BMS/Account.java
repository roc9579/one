package com.itany.mycorejava.BMS;

/**
 * @author 黄鹏程
 * @date 2023年08月21日11:
 * 账户类
 */
public abstract class Account {
    private static int startId=1000;
    private int id;
    private String name;
    private String password;
    private String personId;
    private String phone;
    private double balance;
    public Account() {
        this.id=startId++;
        // 自动生成。初始值1000,每次新开户的卡号自增1。例如:1000、1001、1002...
        // 在构造方法中去生成账户编号
    }

    public Account(String name, String password, String personId, String phone) {
        this.name = name;
        this.password = password;
        this.personId = personId;
        this.phone = phone;
        this.balance = balance;
    }
    public final void deposit(double money){
        this.balance=this.balance+money;
    }
    public abstract boolean withdrawMoney(double money);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
