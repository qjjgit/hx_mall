package com.hx.mall.form;

import lombok.Data;

@Data
public class UserRegisterForm {

    private String phone;

    private String userName;

//    private String email;

    private String smsCode;

    private String password;

}
