package com.itany.mycorejava.Test17_设计模式.模版模式;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 黄鹏程
 * @date 2023年09月18日17:51
 */
public interface Modify <T>{
    String getSql();
    void set(PreparedStatement ps,T t) throws SQLException;
}
