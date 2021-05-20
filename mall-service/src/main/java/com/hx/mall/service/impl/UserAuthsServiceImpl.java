package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.entity.UserAuths;
import com.hx.mall.mapper.UserAuthsMapper;
import com.hx.mall.service.UserAuthsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户登录验证表(UserAuths)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 22:07:31
 */
@Service("userAuthsService")
public class UserAuthsServiceImpl extends ServiceImpl<UserAuthsMapper, UserAuths> implements UserAuthsService {

    private final UserAuthsMapper userAuthsMapper;

    @Autowired
    public UserAuthsServiceImpl(UserAuthsMapper userAuthsMapper) {
        this.userAuthsMapper = userAuthsMapper;
    }


}
