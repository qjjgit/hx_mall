package com.hx.mall.api.controller;

import com.hx.mall.common.exception.GlobalException;
import com.hx.mall.common.exception.UserVerifyException;
import com.hx.mall.entity.UserInfo;
import com.hx.mall.form.UserRegisterForm;
import com.hx.mall.service.UserAuthsService;
import com.hx.mall.service.UserInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class UserController {

    final private UserInfoService userService;
    final private UserAuthsService userAuthsService;

    //构造器 注入 service
    public UserController(UserInfoService userInfoService,UserAuthsService userAuthsService) {
        this.userService = userInfoService;
        this.userAuthsService=userAuthsService;
    }

    @RequestMapping("/user/index")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("view/index");
        return modelAndView;
    }

    @RequestMapping("/user/register")
    public void register(HttpServletRequest request,/* @ModelAttribute*/ UserRegisterForm form){
        try {
            System.out.println(form);
            userService.register(request,form);
        }catch (UserVerifyException e){
            e.printStackTrace();
        }

    }
    @RequestMapping("/user/login")
    public void login(HttpServletRequest request, @RequestBody Map<String,String> form){
        try {
            UserInfo userInfo = userService.loginAuth(request, form);
        } catch (GlobalException e) {
            e.printStackTrace();
        }

    }

}
