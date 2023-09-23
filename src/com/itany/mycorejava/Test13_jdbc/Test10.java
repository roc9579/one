package com.itany.mycorejava.Test13_jdbc;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author 黄鹏程
 * @date 2023年09月14日11:33
 */
public class Test10 {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        Properties p=new Properties();
        try {
            p.load(Test10.class.getClassLoader().getResourceAsStream("dataSource.properties"));

            DataSource ds= BasicDataSourceFactory.createDataSource(p);
            Connection conn=ds.getConnection();
            System.out.println(conn);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
