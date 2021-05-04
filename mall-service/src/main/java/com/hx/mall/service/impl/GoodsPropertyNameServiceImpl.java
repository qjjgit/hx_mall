package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.mapper.GoodsPropertyNameMapper;
import com.hx.mall.pojo.GoodsPropertyName;
import com.hx.mall.service.GoodsPropertyNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (GoodsPropertyName)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:29
 */
@Service("goodsPropertyNameService")
public class GoodsPropertyNameServiceImpl extends ServiceImpl<GoodsPropertyNameMapper, GoodsPropertyName> implements GoodsPropertyNameService {

    private final GoodsPropertyNameMapper goodsPropertyNameMapper;

    @Autowired
    public GoodsPropertyNameServiceImpl(GoodsPropertyNameMapper goodsPropertyNameMapper) {
        this.goodsPropertyNameMapper = goodsPropertyNameMapper;
    }
}
