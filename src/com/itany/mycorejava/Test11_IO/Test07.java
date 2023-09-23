package com.itany.mycorejava.Test11_IO;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄鹏程
 * @date 2023年09月01日14:41
 */
public class Test07 {
    static List<User> users=new ArrayList<>();
    public static void main(String[] args) {
        test01();
        test02();
    }
    public static void test01(){
        try (OutputStream out=new FileOutputStream("test.data");
             ObjectOutputStream oos=new ObjectOutputStream(out);
             ){
            users.add(new User("alice","男",18));
            users.add(new User("alice1","男",18));
            users.add(new User("alice2","男",18));
            oos.writeObject(users);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test02(){
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("test.data"));) {
            List<User> o= (List<User>) in.readObject();
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
