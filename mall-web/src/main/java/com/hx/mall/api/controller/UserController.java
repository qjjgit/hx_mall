package com.hx.mall.api.controller;

import com.hx.mall.common.GlobalException;
import com.hx.mall.entity.UserInfo;
import com.hx.mall.service.UserAuthsService;
import com.hx.mall.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class UserController {

    final private UserInfoService userService;
    final private UserAuthsService userAuthsService;

    public UserController(UserInfoService userInfoService,UserAuthsService userAuthsService) {
        this.userService = userInfoService;
        this.userAuthsService=userAuthsService;
    }

    @RequestMapping("/user/login")
    public void login(HttpServletRequest request, @RequestBody Map<String,String> form, String loginData, String captcha){

        try {
            UserInfo userInfo = userService.loginAuth(request, form);
        } catch (GlobalException e) {
            e.printStackTrace();
        }

    }

}
