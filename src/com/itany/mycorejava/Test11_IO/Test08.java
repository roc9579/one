package com.itany.mycorejava.Test11_IO;

import java.io.*;

/**
 * @author 黄鹏程
 * @date 2023年09月01日15:13
 */
public class Test08 {
    public static void main(String[] args) {
        test02();
    }
    public static void test01(){
        try (
                Reader reader=new FileReader("a.txt");
                Writer writer=new FileWriter("b.txt");
                ){
            char[] c=new char[1024];
            int data;
            while ((data=reader.read(c))!=-1){
                System.out.println(new String(c,0,data));
                writer.write(c,0,data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test02(){
        try (
                Writer writer=new FileWriter("c.txt");
                ){
                char[] c="这句话".toCharArray();
                writer.write(c);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
