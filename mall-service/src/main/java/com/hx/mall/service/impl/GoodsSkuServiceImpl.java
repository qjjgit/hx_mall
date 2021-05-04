package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.mapper.GoodsSkuMapper;
import com.hx.mall.pojo.GoodsSku;
import com.hx.mall.service.GoodsSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (GoodsSku)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:30
 */
@Service("goodsSkuService")
public class GoodsSkuServiceImpl extends ServiceImpl<GoodsSkuMapper, GoodsSku> implements GoodsSkuService {

    private final GoodsSkuMapper goodsSkuMapper;

    @Autowired
    public GoodsSkuServiceImpl(GoodsSkuMapper goodsSkuMapper) {
        this.goodsSkuMapper = goodsSkuMapper;
    }
}
