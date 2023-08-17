package com.itany.mycorejava.code06;

/**
 * @author 黄鹏程
 * @date 2023年08月16日15:53
 */
public class Test04 {
    public static void main(String[] args) {
        Cz c=new Cz();
        c.add(5,6);
        c.add(5,5.6);
    }
}

class Cz{
    public void add(int i,int j){
        System.out.println(i+j);
    }
    public void add(int j,double i){
        System.out.println(i*j);
    }
}