package com.itany.mycorejava.Test08_常用类.枚举;

/**
 * @author 黄鹏程
 * @date 2023年08月25日14:22
 */
public enum Seaon {
    SPRING("春天",1,3),
    ALL
    ;

    private String seaon;
    private int start;
    private int end;

    Seaon() {
    }

    Seaon(String seaon, int start, int end) {
        this.seaon = seaon;
        this.start = start;
        this.end = end;
    }

    public String getSeaon() {
        return seaon;
    }

    public void setSeaon(String seaon) {
        this.seaon = seaon;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
