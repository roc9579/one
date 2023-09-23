package com.itany.mycorejava.Test11_IO;

import java.io.*;

/**
 * @author 黄鹏程
 * @date 2023年09月04日10:40
 */
public class Test11 {
    public static void main(String[] args) {
        //splitFile("JDK-API-1.6.CHM",10000000);
        mergeFile("JDK-API-1.6.CHM_1");
    }
    /**
     * 拆分文件,将一个文件按照指定大小拆分成多个文件,每一个文件名字为:原名字_index,index从1开始,每次自增1
     * 一个输入流,多个输出流,在输出时,每循环一次,输出一个子文件
     * @param path
     * @param length
     */
    public static void splitFile(String path, int length) {
        try (
                FileInputStream in = new FileInputStream(path);
        ) {
            // 设置每次读取的字节数
            byte[] b = new byte[length];
            int data;
            int index = 1;
            while ((data = in.read(b)) != -1) {
                // 每次读取生成一个新的输出流
                FileOutputStream out = new FileOutputStream(path + "_" + index++);
                out.write(b, 0, data);
                // 每次输出完成,关闭当前输出流
                out.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 合并文件,将之前拆分的文件合并为一个文件,将子文件的_index部分删除作为文件名
     * 传入的参数表示的是第一个文件名,按照该文件名的格式将所有格式相同的文件进行合并
     * 所有需要合并的文件名均为:文件名_索引号
     * 一个输出流,多个输入流
     * @param path 传入的需要合并的第一个文件
     */
    public static void mergeFile(String path) {
        // 将传入的文件路净值_包含后面的索引号清除
        path = path.substring(0, path.lastIndexOf("_"));
        try (
                // 指定一个输出流,用于接收输出的数据
                FileOutputStream out = new FileOutputStream(path);
        ) {
            // 读取所有需要合并的文件,其文件名为:path_索引号
            int index = 1;
            File file = null;
            while ((file = new File(path + "_" + index)).exists()) {
                // 定义多个输入流
                FileInputStream in = new FileInputStream(file);
                copyStream(in, out);
                // 关闭输入流
                in.close();
                System.out.println(path + "_" + index + "合并成功");
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copyStream(FileInputStream in, FileOutputStream out) throws IOException {
        // 将当前文件内容写入到指定输出流中
        byte[] b = new byte[1024 * 1024];
        int data;
        while ((data = in.read(b)) != -1) {
            out.write(b, 0, data);
        }
    }
}
