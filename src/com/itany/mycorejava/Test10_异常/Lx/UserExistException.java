package com.itany.mycorejava.Test10_异常.Lx;

/**
 * @author 黄鹏程
 * @date 2023年08月31日10:38
 */
public class UserExistException extends Exception{
    public UserExistException() {
    }

    public UserExistException(String message) {
        super(message);
    }

    public UserExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserExistException(Throwable cause) {
        super(cause);
    }

    public UserExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
