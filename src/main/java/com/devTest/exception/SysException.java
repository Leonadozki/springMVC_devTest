package com.devTest.exception;

public class SysException extends Exception {

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // 捕获时可以配置异常信息内容
    public SysException(String message) {
        this.message = message;
    }
}
