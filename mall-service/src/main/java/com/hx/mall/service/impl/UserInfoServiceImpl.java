package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.common.Consts;
import com.hx.mall.common.PBKDF2;
import com.hx.mall.common.exception.GlobalException;
import com.hx.mall.common.exception.UserVerifyException;
import com.hx.mall.common.utils.ValidatorUtil;
import com.hx.mall.entity.UserAuths;
import com.hx.mall.form.UserRegisterForm;
import com.hx.mall.mapper.UserAuthsMapper;
import com.hx.mall.mapper.UserInfoMapper;
import com.hx.mall.entity.UserInfo;
import com.hx.mall.service.UserInfoService;
import com.hx.mall.vo.UserBaseInfoVO;
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
    private UserInfo authByPhoneAndSms(String phone){
//        QueryWrapper<UserAuths> query = new QueryWrapper<>();
//        query.eq("identity_type",Consts.IdentityType.PHONE);
//        query.eq("identifier",phone);
//        UserAuths userAuths = userAuthsMapper.selectOne(query);
        if (userAuthsMapper.exists(phone, Consts.IdentityType.PHONE)){
            //当前手机号未绑定账号 或 未注册
        }
        return null;
    }

    @Override
    public UserBaseInfoVO register(HttpServletRequest request, UserRegisterForm form) throws UserVerifyException {
        if (smsCodeVerify(request,form.getSmsCode())){
            UserBaseInfoVO userBaseInfoVO = new UserBaseInfoVO();
            String salt=null;
            if(form.getPassword()!=null) {
                salt = PBKDF2.getSalt();
            }
            if (form.getPhone()!=null){
                if (!ValidatorUtil.isPhoneNumber(form.getPhone())){
                    throw new UserVerifyException("请输入正确的手机号！", Consts.ErrorCode.PHONE_NUMBER_FORMAT_ERROR);
                }else if (userAuthsMapper.exists(form.getPhone(), Consts.IdentityType.PHONE)){
                    throw new UserVerifyException("该手机号已被注册过！", Consts.ErrorCode.PHONE_ALREADY_REGISTERED_ERROR);
                }else{
                    UserAuths auth = new UserAuths();
                    auth.setIdentityType(Consts.IdentityType.PHONE);
                    auth.setIdentifier(form.getPhone());
                    if(salt!=null){
                        auth.setSalt(salt);
                        auth.setCredential(PBKDF2.getPBKDF2(form.getPassword(),salt));
                    }
                    if (userAuthsMapper.addAuth(auth)) {

                    }
                }
            }
            if (form.getUserName()!=null){
                if (userAuthsMapper.exists(form.getUserName(), Consts.IdentityType.EMAIL)){
                    throw new UserVerifyException("该用户名已存在！", Consts.ErrorCode.USERNAME_ALREADY_REGISTERED_ERROR);
                }else if(form.getUserName()!=null){
                    UserAuths auth = new UserAuths();
                    auth.setIdentityType(Consts.IdentityType.USERNAME);
                    auth.setIdentifier(form.getUserName());
                    if(salt!=null){
                        auth.setSalt(salt);
                        auth.setCredential(PBKDF2.getPBKDF2(form.getPassword(),salt));
                    }
                    userAuthsMapper.addAuth(auth);
                }
            }

            if (form.getPhone()==null && form.getUserName()==null ){
                throw new UserVerifyException("手机号和用户名至少填写一个！", Consts.ErrorCode.USER_REGISTER_ERROR);
            }
        }else {throw new UserVerifyException("验证码错误！", Consts.ErrorCode.SMS_CODE_ERROR);}
        return null;
    }
    private boolean registerByPhone( UserRegisterForm form){

    }

    public boolean smsCodeVerify(HttpServletRequest request,String smsCode){
        String smsCode_session = (String) request.getSession(false).getAttribute("smsCode");
        if (null==smsCode_session||null==smsCode)return false;
        return smsCode_session.equals(smsCode);
    }

}
