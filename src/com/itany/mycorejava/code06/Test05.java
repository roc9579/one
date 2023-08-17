package com.itany.mycorejava.code06;

/**
 * @author 黄鹏程
 * @date 2023年08月16日16:24
 */
public class Test05 {
    public static void main(String[] args) {

    }
}
class Gz{
    int id;
    String username;
    public Gz(){

    }
    public Gz(String username){
        this.username=username;
    }
    public Gz(int id){
        this.id=id;
    }
    public Gz(int id,String username){
        this(username);
        this.id=id;
    }
}