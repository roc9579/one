package com.itany.mycorejava.homework._8_17.黄鹏程;

/**
 * @author 黄鹏程
 * @date 2023年08月17日17:11
 */
public class Card {

    private String color; // 花色
    private String num; // 点数

    public Card(){

    }

    public Card(String color,String num){
        this.color = color;
        this.num = num;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setNum(String num){
        this.num = num;
    }

    public String getColor(){
        return color;
    }

    public String getNum(){
        return num;
    }

}