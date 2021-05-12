package com.hx.mall.api.controller;

import com.ramostear.captcha.HappyCaptcha;
import com.ramostear.captcha.support.CaptchaStyle;
import com.ramostear.captcha.support.CaptchaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ShopController {
    //    @Resource
    //    ShopInfoService shopInfoService;
    //
    //    @Resource
    //    GoodsInfoService goodsInfoService;
    @RequestMapping("/")
    public String index0(){
        return "首页";
    }
    @RequestMapping("/shop/login/index")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("shop_login");
         return modelAndView;
    }
    //商家注册
//    @PostMapping("/shop/register")
//    public String shopRegister(){
//
//        return "";
//    }
    @RequestMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response){
        HappyCaptcha.require(request, response)
                .style(CaptchaStyle.IMG).type(CaptchaType.WORD).build().finish();
        String code = (String)request.getSession(false).getAttribute("happy-captcha");
        System.out.println("code: "+code);
    }
}
