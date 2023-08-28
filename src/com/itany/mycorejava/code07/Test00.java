package com.itany.mycorejava.code07;

/**
 * @author 黄鹏程
 * @date 2023年08月20日15:42
 */
public class Test00 {
    public static void main(String[] args) {
        T t=new T();
        int[] a ={1,2,3};
        int[] b = {2,3};
        t.sum(a);
    }
}
class T{
    public void sum(int... nums){
        System.out.println(nums.length);
    }

}