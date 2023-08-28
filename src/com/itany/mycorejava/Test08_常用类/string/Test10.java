package com.itany.mycorejava.Test08_常用类.string;

/**
 * @author 黄鹏程
 * @date 2023年08月24日14:13
 */
public class Test10 {
    public static void main(String[] args) {
        byte b=1;
        Byte b1=new Byte(b);
        Byte b2=b;
        System.out.println(b1==b2);
        Byte b3=Byte.valueOf(b);
        System.out.println(b1==b3);
        System.out.println(b2==b3);

        Boolean boo1=new Boolean(true);
        Boolean boo2=true;
        Boolean boo3=Boolean.valueOf(true);
        System.out.println(boo2==boo3);


        Double d1=3.14;
        Double d2=new Double(3.14);
        Double d3=Double.valueOf(3.14);
        Double d4=Double.valueOf("3.14");
        System.out.println(d3==d4);

        Integer i=1;
        int t=i;
        Integer i1=new Integer(1);

        int i11=1;
        Integer integer1=new Integer(i11);
        Integer integer=1;
        System.out.println(integer==integer1);



    }
}
