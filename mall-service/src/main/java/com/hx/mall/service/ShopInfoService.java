package com.hx.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hx.mall.pojo.ShopInfo;

import java.io.Serializable;

/**
 * (ShopInfo)表服务接口
 *
 * @author makejava
 * @since 2021-04-27 22:33:35
 */
public interface ShopInfoService extends IService<ShopInfo> {
    @Override
    boolean save(ShopInfo entity);

    @Override
    boolean saveOrUpdate(ShopInfo entity);

    ShopInfo getById(ShopInfo entity);

    boolean removeById(ShopInfo entity);
}
