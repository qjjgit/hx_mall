package com.hx.mall.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ShopController {
    @RequestMapping("/shop/login/index")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("shop_login");
         return modelAndView;
    }
    //商家注册
    @PostMapping("/shop/register")
    public String shopRegister(){

        return "";
    }
}
