package com.hx.mall.common.exception;


import com.hx.mall.common.Consts;

public class GlobalException extends Exception {

    private String errorCode;

    public GlobalException() { }

    public GlobalException(String message) {
        super(message);
        this.errorCode = Consts.ErrorCode.SYSTEM_ERROR;
    }

    public GlobalException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
