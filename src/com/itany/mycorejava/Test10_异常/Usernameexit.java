package com.itany.mycorejava.Test10_异常;

/**
 * @author 黄鹏程
 * @date 2023年08月31日09:26
 */
public class Usernameexit extends RuntimeException{
    public Usernameexit() {
    }

    public Usernameexit(String message) {
        super(message);
    }

    public Usernameexit(String message, Throwable cause) {
        super(message, cause);
    }

    public Usernameexit(Throwable cause) {
        super(cause);
    }

    public Usernameexit(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
