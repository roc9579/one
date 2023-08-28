package com.itany.mycorejava.Test08_常用类.枚举;

/**
 * @author 黄鹏程
 * @date 2023年08月25日14:21
 */
public class Sport {
    private String name;
    private Seaon seaon;

    public Sport() {
    }

    public Sport(String name, Seaon seaon) {
        this.name = name;
        this.seaon = seaon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seaon getSeaon() {
        return seaon;
    }

    public void setSeaon(Seaon seaon) {
        this.seaon = seaon;
    }
}
