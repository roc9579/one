package com.itany.mycorejava.Test11_IO;

import java.io.File;


/**
 * @author 黄鹏程
 * @date 2023年08月31日14:24
 */
public class Test03 {
    public static void main(String[] args) {
        File file=new File("test");
        show(file);
    }
    public static void show(File file){
        if (file.exists()){

        }else{
            System.out.println("没有找到对象");
            return;
        }
        if (file.isDirectory()){
            File[] files=file.listFiles();
            for (File file1:files){
                if (file1.isDirectory()){
                    System.out.print(file1.getName()+"\t");
                    show(file1);
                }else{
                    System.out.print(file1.getName()+"\t");
                }
            }
        }else{
            System.out.println(file.getName());
        }
    }
}
