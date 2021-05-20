package com.hx.mall.api.controller;

import org.springframework.session.data.redis.config.annotation.SpringSessionRedisConnectionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController()
public class CaptchaApi {
    @RequestMapping("/api/captcha/getList")
    @ResponseBody
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("测试文章段落1");
        list.add("测试文章段落2");
        list.add("测试文章段落3");
        list.add("测试文章段落4");
        return list;
    }
    @RequestMapping("/api/captcha/sms/send")
    @ResponseBody
    public String smsSend(String phone, HttpServletRequest request){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        request.getSession().setAttribute("code",sb.toString());
        System.out.println("code: "+sb);
        return sb.toString();
    }
    @RequestMapping("/api/captcha/sms/verify")
    @ResponseBody
    public String smsVerify(String code, HttpServletRequest request){
        System.out.println("code = " + code);
        String code_session = (String) request.getSession(false).getAttribute("code");
        System.out.println("code_session = " + code_session);
        if (null==code_session||null==code)return "fail";
        return code_session.equals(code)?"success":"fail";
    }

}

