package com.itany.mycorejava.code07;

/**
 * @author 黄鹏程
 * @date 2023年08月17日09:47
 */
public class Test01 {
    public String name;
    protected int age ;
    String sex;
    private String hobby;

    public static void main(String[] args) {
        Test test=new Test();
        Test01 t1=new Test01();
        System.out.println(t1.name);
    }
}
class Test{
    public String name;
    protected int age ;
    String sex;
    private String hobby;
    public static void SS(){
        Test s1=new Test();
        System.out.println(s1.name);
    }
}