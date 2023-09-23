package com.itany.mycorejava.Test11_IO;

import java.io.File;
import java.net.URISyntaxException;

/**
 * @author 黄鹏程
 * @date 2023年08月31日11:46
 */
public class Test01 {
    public static void main(String[] args) throws URISyntaxException {
        File file=new File("./one.iml");
        System.out.println(file.exists());

        File file1=new File(
                Test01.class
                .getClassLoader()
                .getResource("set.properties")
                .toURI());
        System.out.println(file1.exists());
    }
}
