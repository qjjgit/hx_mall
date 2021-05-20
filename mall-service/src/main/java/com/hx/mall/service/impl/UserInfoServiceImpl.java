package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.common.Constant;
import com.hx.mall.common.GlobalException;
import com.hx.mall.common.ValidatorUtil;
import com.hx.mall.entity.UserAuths;
import com.hx.mall.mapper.UserAuthsMapper;
import com.hx.mall.mapper.UserInfoMapper;
import com.hx.mall.entity.UserInfo;
import com.hx.mall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * (UserInfo)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 22:07:32
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    final UserInfoMapper userInfoMapper;
    final UserAuthsMapper userAuthsMapper;

    @Autowired
    public UserInfoServiceImpl(UserInfoMapper userInfoMapper, UserAuthsMapper userAuthsMapper) {
        this.userInfoMapper = userInfoMapper;
        this.userAuthsMapper = userAuthsMapper;
    }

    @Override
    public UserInfo loginAuth(HttpServletRequest request, Map<String,String> form) throws GlobalException {
        if (ValidatorUtil.isPhoneNumber(form.get("phone"))) {
            if (form.get("smsCode")!=null&&!form.get("smsCode").isEmpty()) {
                if (smsCodeVerify(request,form.get("smsCode"))){
                    return authByPhoneAndSms(form.get("phone"));
                }else {throw new GlobalException("验证码错误！",600);}
            }else{
//                form.get("pwd")!=null
            }
        }else if(ValidatorUtil.isEmail(form.get("email"))){
            return null;
        }
        return null;
    }
    private UserInfo authByPhoneAndSms(String phone){
        UserAuths userAuths = new UserAuths();
        userAuths.setIdentityType(Constant.IdentityType.PHONE);
        userAuths.setIdentifier(phone);
        return null;
    }
    public boolean smsCodeVerify(HttpServletRequest request,String smsCode){
        String smsCode_session = (String) request.getSession(false).getAttribute("smsCode");
        if (null==smsCode_session||null==smsCode)return false;
        return smsCode_session.equals(smsCode);
    }

}
