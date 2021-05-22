package com.hx.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hx.mall.common.exception.GlobalException;
import com.hx.mall.common.exception.UserVerifyException;
import com.hx.mall.entity.UserInfo;
import com.hx.mall.form.UserRegisterForm;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * (UserInfo)表服务接口
 *
 * @author 覃建嘉
 * @since 2021-04-29 22:07:32
 */
public interface UserInfoService extends IService<UserInfo> {
    UserInfo loginAuth(HttpServletRequest request,Map<String, String> form) throws UserVerifyException;
    boolean register(HttpServletRequest request, UserRegisterForm form) throws UserVerifyException;
}
