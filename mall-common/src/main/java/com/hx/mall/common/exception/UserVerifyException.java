package com.hx.mall.common.exception;

import com.hx.mall.common.Consts;

public class UserVerifyException extends GlobalException{
    public UserVerifyException() { }

    public UserVerifyException(String message) {
        super(message, Consts.ErrorCode.USER_ERROR);
    }

    public UserVerifyException(String message, String errorCode) {
        super(message, errorCode);
    }
}
