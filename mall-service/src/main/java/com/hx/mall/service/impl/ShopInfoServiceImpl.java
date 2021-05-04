package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.pojo.ShopInfo;
import com.hx.mall.mapper.ShopInfoMapper;
import com.hx.mall.service.ShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (ShopInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-27 22:33:36
 */
@Service("shopInfoService")
public class ShopInfoServiceImpl extends ServiceImpl<ShopInfoMapper, ShopInfo> implements ShopInfoService {

    private final ShopInfoMapper shopInfoMapper;

    @Autowired
    public ShopInfoServiceImpl(ShopInfoMapper shopInfoMapper) {
        this.shopInfoMapper = shopInfoMapper;
    }
}
