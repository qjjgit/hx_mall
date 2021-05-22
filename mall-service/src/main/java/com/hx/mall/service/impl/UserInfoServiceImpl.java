package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.common.Consts;
import com.hx.mall.common.exception.GlobalException;
import com.hx.mall.common.exception.UserVerifyException;
import com.hx.mall.common.utils.ValidatorUtil;
import com.hx.mall.entity.UserAuths;
import com.hx.mall.form.UserRegisterForm;
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
    public UserInfo loginAuth(HttpServletRequest request, Map<String,String> form) throws UserVerifyException {
        if (ValidatorUtil.isPhoneNumber(form.get("phone"))) {
            if (form.get("smsCode")!=null&&!form.get("smsCode").isEmpty()) {
                if (smsCodeVerify(request,form.get("smsCode"))){
                    return authByPhoneAndSms(form.get("phone"));
                }else {throw new UserVerifyException("验证码错误！", Consts.ErrorCode.SMS_CODE_ERROR);}
            }else{
//                form.get("pwd")
            }
        }else if(ValidatorUtil.isEmail(form.get("email"))){
            return null;
        }
        return null;
    }

    @Override
    public boolean register(HttpServletRequest request,UserRegisterForm form) throws UserVerifyException {
        return false;
    }

    private UserInfo authByPhoneAndSms(String phone){
        QueryWrapper<UserAuths> query = new QueryWrapper<>();
        query.eq("identity_type",Consts.IdentityType.PHONE);
        query.eq("identifier",phone);
        UserAuths userAuths = userAuthsMapper.selectOne(query);
        if (userAuths==null){
            //当前手机号未绑定账号 或 未注册
        }
        System.out.println(userAuths);
        return null;
    }
    public boolean smsCodeVerify(HttpServletRequest request,String smsCode){
        String smsCode_session = (String) request.getSession(false).getAttribute("smsCode");
        if (null==smsCode_session||null==smsCode)return false;
        return smsCode_session.equals(smsCode);
    }

}
