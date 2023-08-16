package com.itany.mycorejava.code02;

/**
 * @author 黄鹏程
 * @date 2023年08月10日13:52
 */
public class Test03 {
    public static void main(String[] args) {
        int num1 = -2,num2 = 3;
        /*
            num1原码：10000000 00000000 00000000 00000010
            num1反码：11111111 11111111 11111111 11111101
            num1补码：11111111 11111111 11111111 11111110
            num2原码：00000000 00000000 00000000 00000011
                     00000000 00000000 00000000 00000010    2
        */
        System.out.println(num1 & num2);
        /*
            num1原码：10000000 00000000 00000000 00000010
            num1反码：11111111 11111111 11111111 11111101
            num1补码：11111111 11111111 11111111 11111110
            num2原码：00000000 00000000 00000000 00000011
                     11111111 11111111 11111111 11111111
                     11111111 11111111 11111111 11111110
                     10000000 00000000 00000000 00000001    -1
        */
        System.out.println(num1 | num2);
        /*
            num1原码：10000000 00000000 00000000 00000010
            num1反码：11111111 11111111 11111111 11111101
            num1补码：11111111 11111111 11111111 11111110
                     00000000 00000000 00000000 00000001    1
        */
        System.out.println(~num1);
        /*
            num1原码：10000000 00000000 00000000 00000010
            num1反码：11111111 11111111 11111111 11111101
            num1补码：11111111 11111111 11111111 11111110
            num2原码：00000000 00000000 00000000 00000011
                     11111111 11111111 11111111 11111101
                     11111111 11111111 11111111 11111100
                     10000000 00000000 00000000 00000011    -3
        */
        System.out.println(num1 ^ num2);
        /*
            num1原码：10000000 00000000 00000000 00000010
            num1反码：11111111 11111111 11111111 11111101
            num1补码：11111111 11111111 11111111 11111110
                     11111111 11111111 11111111 11111000
                     11111111 11111111 11111111 11110111
                     10000000 00000000 00000000 00001000    -8
        */
        System.out.println(num1 << 2);
        /*
            num1原码：10000000 00000000 00000000 00000010
            num1反码：11111111 11111111 11111111 11111101
            num1补码：11111111 11111111 11111111 11111110
                     11111111 11111111 11111111 11111111
                     11111111 11111111 11111111 11111110
                     10000000 00000000 00000000 00000001    -1
         */
        System.out.println(num1 >> 2);
        /*
            num1原码：10000000 00000000 00000000 00000010
            num1反码：11111111 11111111 11111111 11111101
            num1补码：11111111 11111111 11111111 11111110
                     00111111 11111111 11111111 11111111
        */
        System.out.println(num1 >>> 2);

    }
}
