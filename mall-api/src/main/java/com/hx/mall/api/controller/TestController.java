package com.hx.mall.api.controller;

import com.hx.mall.pojo.ShopInfo;
import com.hx.mall.service.GoodsInfoService;
import com.hx.mall.service.ShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

//    @Resource
//    ShopInfoService shopInfoService;
//
//    @Resource
//    GoodsInfoService goodsInfoService;

    @RequestMapping("/")
    public String index(){
        System.out.println("......");
        return "hello world";
    }
}
