package com.itany.mycorejava.Test11_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author 黄鹏程
 * @date 2023年09月01日13:44
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        byte[] bytes="Heelo Word".getBytes();
        ByteArrayInputStream in=new ByteArrayInputStream(bytes);

        byte[] b=new byte[1024];
        int i;
        while ((i=in.read(b))!=-1){
            //System.out.println(new String(b,0,i));
        }

        ByteArrayOutputStream out =new ByteArrayOutputStream();
        out.write(b);
        byte[] data=out.toByteArray();
        System.out.println(new String(data));
    }
}
