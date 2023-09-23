package com.itany.mycorejava.Test10_异常;

/**
 * @author 黄鹏程
 * @date 2023年08月30日16:25
 */
public class Test01 {
    public static void main(String[] args) {

        try{
            System.out.println("运行之前");
            String[] s=new String[5];
            System.out.println(s[5]);
            System.out.println("未出错");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("逮到了");
            System.err.println(a.getMessage());
        }finally {
            System.out.println("结束");
        }
    }
}
