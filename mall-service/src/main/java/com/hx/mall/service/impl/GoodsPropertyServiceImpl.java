package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.mapper.GoodsPropertyMapper;
import com.hx.mall.pojo.GoodsProperty;
import com.hx.mall.service.GoodsPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (GoodsProperty)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:29
 */
@Service("goodsPropertyService")
public class GoodsPropertyServiceImpl extends ServiceImpl<GoodsPropertyMapper, GoodsProperty> implements GoodsPropertyService {

    private final GoodsPropertyMapper goodsPropertyMapper;

    @Autowired
    public GoodsPropertyServiceImpl(GoodsPropertyMapper goodsPropertyMapper) {
        this.goodsPropertyMapper = goodsPropertyMapper;
    }
}
