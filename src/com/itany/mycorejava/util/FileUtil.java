package com.itany.mycorejava.util;

import java.io.*;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月01日11:51
 */
// 定义一个文件工具类FileUtil,实现以下方法
// 1.将一个文件拷贝一份到指定的文件中
// 2.将一个目录中所有的文件拷贝到指定目录中
// 3.将一个目录中的文件与子目录递归拷贝到一个指定的目录中
public class FileUtil {


    // 1.将一个文件拷贝一份到指定的文件中
    public static void copy(String src,String tar){
        try (
                InputStream in=new FileInputStream(new File(src));
                OutputStream out=new FileOutputStream(new File(tar));
        )
        {
            byte[] b=new byte[1024];
            int data;
            while ((data=in.read(b))!=-1){
                out.write(b,0,data);
            }
            System.out.println(src+" --> "+tar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2.将一个目录中所有的文件拷贝到指定目录中
    public static void copyAllFile(String src,String tar) throws FileNotFoundException {
        File srcf=new File(src);
        File tarf=new File(tar);
        tarf.mkdirs();
        if (!srcf.exists()){
            throw new FileNotFoundException("文件不存在");
        }
        if (srcf.isDirectory()){
            File[] files=srcf.listFiles();
            for (File f:files){
                if (f.isFile()){
                   try (InputStream in =new FileInputStream(new File(f.getAbsolutePath()));
                        OutputStream out=new FileOutputStream(new File(tar+"/"+f.getName()));
                        ){
                       byte[] b=new byte[1024];
                       int data;
                       while ((data=in.read(b))!=-1){
                            out.write(b,0,data);
                       }
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                }else{
                    copyAllFile(f.getAbsolutePath(),tar);
                }
            }
        }else{
            System.out.println("不是目录");
        }



    }
    // 3.将一个目录中的文件与子目录递归拷贝到一个指定的目录中
    public static void copyAll(String src,String tar) throws FileNotFoundException {
        File srcf=new File(src);
        File tarf=new File(tar);
        tarf.mkdirs();
        if (!srcf.exists()){
            throw new FileNotFoundException("文件不存在");
        }
        if (srcf.isDirectory()){
            copyAllFile(src,tar);
            File[] files=srcf.listFiles();
            for (File f:files){
                if (f.isDirectory()){
                    copyAll(f.getAbsolutePath(),tar+"/"+f.getName());
                }
            }
        }else{
            System.out.println("不是目录");
        }
    }


    // 在工具类FileUtil中新增方法
    // 1.拆分文件,将一个文件按照指定大小拆分成多个文件,每一个文件名字为:原名字_index,index从1开始,每次自增1
    // 一个输入流,多个输出流,在输出时,每循环一次,输出一个子文件
    // 2.合并文件,将之前拆分的文件合并为一个文件,将子文件的_index部分删除作为文件名
    // 一个输出流,多个输入流

    public static void split(String src,int size) throws FileNotFoundException {
        File file=new File(src);
        if (!file.exists()){
            throw new FileNotFoundException("文件不存在");
        }
        if (file.isFile()){
            try (
                    InputStream in=new FileInputStream(file);
            ){
                byte[] b=new byte[1024];
                int data;
                while ((data=in.read())!=-1){
                    int num=0;
                    for (int i=0;i<(data/size)+1;i++){
                        String[] strings=file.getName().split(".");
                        try(
                                OutputStream out=new FileOutputStream(new File(file.getParent()+"/"+strings[0]+"-"+(i+1)+"."+strings[1]));
                        ) {
                            out.write(b,num,num=num+size);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    // 2.合并文件,将之前拆分的文件合并为一个文件,将子文件的_index部分删除作为文件名
    // 一个输出流,多个输入流
    public static void merge(String src,int num){
        File file=new File(src);
        if (file.isDirectory()){
            File[] files=file.listFiles();
            byte[] b=new byte[1024];
            String s = null;
            for (File f:files){
                try (
                        InputStream in=new FileInputStream(f);
                        ){
                    int data;
                    while ((data=in.read(b))!=-1){

                    }
                    s=f.getName();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            s=s.replaceAll("[_\\d]","");
            try(
                    OutputStream out=new FileOutputStream(new File(s),true)
                    ) {
                out.write(b);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 在工具类FileUtil中新增两个方法:文件加密与解密,加密与解密均通过异或操作实现
    // 1.文件加密,读取文件中的每一个字节,根据指定的密码对其进行加密,加密后的文件添加.sec后缀
    // a.txt --> a.txt.sec
    public static void encrypt(String src,int password) throws FileNotFoundException {
        File file =new File(src);
        if (!file.isFile()){
            throw new FileNotFoundException("文件不存在");
        }
        try (
                InputStream in=new FileInputStream(file);
                OutputStream out=new FileOutputStream(new File(src+".sec"))
                ){
            byte[] b=new byte[1024];
            int data;
            while ((data=in.read(b))!=-1){
                for (int i=0;i<data;i++){
                    b[i]= (byte) (b[i] ^ password);
                }
                out.write(b,0,data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //"a.txt.sec".replaceAll("\\.sec","");
    }

    // 2.文件解密,读取加密后的文件中的每一个字节,根据指定的密码对其进行解密,解密后的文件去除.sec后缀
    // a.txt.sec --> a.txt
    public static void decrypt(String src,int password) throws FileNotFoundException {
        File file=new File(src);
        if (!file.isFile()){
            throw new FileNotFoundException("不是文件");
        }
        try(
                InputStream in=new FileInputStream(file);
                OutputStream out=new FileOutputStream(new File(src.replace(".sec","")))
                ) {
            byte[] b=new byte[1024];
            int data;
            while ((data=in.read(b))!=-1){
                for (int i=0;i<data;i++){
                    b[i]= (byte) (b[i] ^ password);
                }
                out.write(b,0,data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
