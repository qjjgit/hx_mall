package com.hx.mall.common.utils;

public class UserUtil {
    public static String createUserName(){
        return  String.format("hx_%s",StringUtil.randomString(10));
    }
}
