package com.itany.mycorejava.Test11_IO;

import com.itany.mycorejava.homework._8_24.黄鹏程.util.DateUtil;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Date;

/**
 * @author 黄鹏程
 * @date 2023年08月31日13:46
 */
public class Test02 {

    public static void main(String[] args) throws URISyntaxException {
        File file=new File(Test02.class.getClassLoader().getResource("set.properties").toURI());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

        File file1=new File("src/set.properties");
        System.out.println(file1.exists());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getParentFile());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(DateUtil.toString(new Date(file1.lastModified())));
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(File.separator);
    }
}
