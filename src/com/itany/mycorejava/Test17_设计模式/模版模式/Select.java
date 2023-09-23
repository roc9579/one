package com.itany.mycorejava.Test17_设计模式.模版模式;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 黄鹏程
 * @date 2023年09月18日18:41
 */
public interface Select<T> {
    String getSql();
    void set(PreparedStatement ps, T t) throws SQLException;
    void set1(T t, ResultSet rs);
}
