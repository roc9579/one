package com.itany.mycorejava.code05;

/**
 * @author 黄鹏程
 * @date 2023年08月14日13:54
 */
public class Test01 {
    public static void main(String[] args) {
        int[] num = new int[5];
        String[] name =new String[6];
        double[] nums = new double[6];
        char[] chars = new char[3];
        System.out.println(num[0]+name[1]+nums[2]+chars[2]);
        name[1]="666";
        num[1]=1;
        nums[2]=2.0;
        int[] num1= new int[]{2,3,46,7};
        String[] user1 =new String[]{"xshi","hs","js"};
        System.out.println(user1.length);
        //循环遍历数组
        for (int i=0;i<user1.length;i++){
            System.out.println(user1[i]);
        }
        for (int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
        }
        String[] str=new String[6];
        String[] str1=new String[]{"hs","jsh","dsjk","jj","nn"};

    }
}
