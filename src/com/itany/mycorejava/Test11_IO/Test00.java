package com.itany.mycorejava.Test11_IO;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author 黄鹏程
 * @date 2023年09月01日10:28
 */
public class Test00 {
    public static void main(String[] args) {

    }

    public static void remove(String path,String rootpath) throws FileNotFoundException {
        File file=new File(path,rootpath);

        if (!file.exists()){
            throw new FileNotFoundException("不是文件");
        }
        if (file.isDirectory()){

            String f1=file.getAbsolutePath();
            String f2=file.getParentFile().getAbsolutePath();

            File[] files=file.listFiles();
            if (files.length==0){
                file.delete();

                if (!f1.equals(rootpath)) {
                    remove(f2, rootpath);
                } else {
                    return;
                }
            }else {
                for (File f:files){
                    remove(f.getAbsolutePath(),rootpath);
                }
            }
        }
    }
}
