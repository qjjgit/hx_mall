package com.hx.mall.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserBaseInfoVO {

    private String userId;

    private String userName;

    private String nickname;

    private String headThumb;

    // 0女、1男、2未知
    private Integer sex;

    private Date birthday;

}
