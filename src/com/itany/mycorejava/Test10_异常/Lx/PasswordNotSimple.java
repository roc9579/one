package com.itany.mycorejava.Test10_异常.Lx;

/**
 * @author 黄鹏程
 * @date 2023年08月31日18:21
 */
public class PasswordNotSimple extends Exception{
    public PasswordNotSimple() {
    }

    public PasswordNotSimple(String message) {
        super(message);
    }

    public PasswordNotSimple(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotSimple(Throwable cause) {
        super(cause);
    }

    public PasswordNotSimple(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
