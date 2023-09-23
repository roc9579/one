package com.itany.mycorejava.Test11_IO;

import java.io.File;
import java.nio.file.NotDirectoryException;

/**
 * @author 黄鹏程
 * @date 2023年08月31日16:51
 */
public class Test {
    public static void main(String[] args) {
        File file=new File("test");
        //System.out.println(file.length());
        delete(file);

    }
    public static void delete(File file){
        try {
            if (!file.isDirectory()){
                throw new NotDirectoryException("不是目录");
            }
        } catch (NotDirectoryException e) {
            e.printStackTrace();
        }
        File[] files=file.listFiles();
        for (File f:files){
            if (f.isDirectory()){
                File[] fs=f.listFiles();
                if (fs.length==0){
                    Boolean b=f.delete();
                    if (b){
                        System.out.println("成功删除空目录"+f.getName());
                    }
                }else{
                    delete(f);
                }
            }
        }
    }
}
