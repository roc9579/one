package com.itany.mycorejava.code01;

/**
 * @author 黄鹏程
 * @date 2023年08月10日09:34
 */
public class Test05 {
    public static void main(String[] args){
        //0b1011 1110
        System.out.println(1*2+1*4+1*8+1*16+1*32+1*64*2);
        //04567
        System.out.println(7+6*8+5*64+4*64*8);
        //0x123abc
        System.out.println(12+11*16+10*16*16+3*Math.pow(16,3)+2*Math.pow(16,4)+1*Math.pow(16,5));

        //365
        /*  365/2=182...1
            182/2=91...0
            91/2=45...1
            45/2=22...1
            22/2=11...0
            11/2=5...1
            5/2=2...1
            2/2=1...0
            1/2=0...1
            101101101
        */
        /*
            365/8=45...5
            45/8=5...5
            5/8=0...5
            555
        */
        /*
            365/16=22...13
            22/16=1...6
            1/16=0...1
            16d
        */
    }
}
