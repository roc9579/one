package com.itany.mycorejava.Test10_异常.Lx;

/**
 * @author 黄鹏程
 * @date 2023年08月31日17:44
 */
public class InputError extends Exception{
    public InputError() {
    }

    public InputError(String message) {
        super(message);
    }

    public InputError(String message, Throwable cause) {
        super(message, cause);
    }

    public InputError(Throwable cause) {
        super(cause);
    }

    public InputError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
