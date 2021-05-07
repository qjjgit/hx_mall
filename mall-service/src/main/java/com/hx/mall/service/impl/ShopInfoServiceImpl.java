package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.pojo.ShopInfo;
import com.hx.mall.mapper.ShopInfoMapper;
import com.hx.mall.service.ShopInfoService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * (ShopInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-27 22:33:36
 */
@Service("shopInfoService")
@CacheConfig(cacheNames = "shop")
public class ShopInfoServiceImpl extends ServiceImpl<ShopInfoMapper, ShopInfo> implements ShopInfoService {

    @Override
    @CachePut(key = "#entity.shopId")
    public boolean save(ShopInfo entity) {
        return super.save(entity);
    }

    @Override
    @CachePut(key = "#entity.shopId")
    public boolean saveOrUpdate(ShopInfo entity) {
        return super.saveOrUpdate(entity);
    }

    @Override
    @Cacheable(key = "#entity.shopId")
    public ShopInfo getById(ShopInfo entity){
        return super.getById(entity.getShopId());
    }

    @Override
    @CacheEvict(key = "#entity.shopId")
    public boolean removeById(ShopInfo entity){
        entity.setStatus(0);
        return super.updateById(entity);
    }
}
