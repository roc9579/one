package com.itany.mycorejava.Test11_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 黄鹏程
 * @date 2023年08月31日16:29
 */
public class Test04 {
    public static void main(String[] args) {
        test01();
    }
    public static void test01(){
        try (
                //JDK7引入了一个新的语法,叫做try-with-resource
                // 用于自动关闭外部资源,此时不需要通过finally进行关闭
                // 此处创建的对象最终会自动释放资源
                FileInputStream in = new FileInputStream("a.txt");
                // 在此处,只能使用实现了AutoCloseable接口的类
                // String s = new String("admin"); // 报错
        ) {
            // 由于文件中出现了中文,每次读取一个字节会导致出现乱码问题
            // 因此,可以考虑一次读取多个字节
//            byte[] b = new byte[3];
            // 方法返回值:存储到数据缓存区的字节数量,当没有读取到时返回-1
            // b:真正存储数据的缓冲区
//            int data = in.read(b);
//            System.out.println(data);
//            System.out.println(Arrays.toString(b));
//            System.out.println(new String(b));

            // 此时还存在一个小问题:当中文不是从头开始,而是中间开始,且不是3的倍数时
            // 依然会出现乱码
            // 此时将缓冲区的字节数组的长度定义的较大一点,尽可能超过整个文件内容的字节总数
            // 使得中文不会中途断开,避免断开后产生乱码问题
            File file=new File("a.txt");
            //System.out.println();
            byte[] b = new byte[(int) file.length()];
            // 此时的方法返回值表示的是有效字符的长度
            int data = in.read(b);
            System.out.println(data);
            System.out.println(new String(b));
            // 此时直接读取时,会读取到空白字符
//            int data;
//            while((data = in.read(b)) != -1){
//                // 此时读取时需要将内容后面的空白去除掉
//                // 参数一:需要转换的字节数组
//                // 参数二:从哪一个索引位置开始转换
//                // 参数三:转换多少个字节
//                System.out.println(new String(b,0,data));;
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
