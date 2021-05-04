package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.mapper.GoodsPropertyValueMapper;
import com.hx.mall.pojo.GoodsPropertyValue;
import com.hx.mall.service.GoodsPropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (GoodsPropertyValue)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:29
 */
@Service("goodsPropertyValueService")
public class GoodsPropertyValueServiceImpl extends ServiceImpl<GoodsPropertyValueMapper, GoodsPropertyValue> implements GoodsPropertyValueService {

    private final GoodsPropertyValueMapper goodsPropertyValueMapper;

    @Autowired
    public GoodsPropertyValueServiceImpl(GoodsPropertyValueMapper goodsPropertyValueMapper) {
        this.goodsPropertyValueMapper = goodsPropertyValueMapper;
    }
}
