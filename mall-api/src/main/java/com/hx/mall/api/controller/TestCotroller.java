package com.hx.mall.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCotroller {

    @RequestMapping("/")
    public String index(){
        System.out.println("......");
        return "hello world";
    }
}
