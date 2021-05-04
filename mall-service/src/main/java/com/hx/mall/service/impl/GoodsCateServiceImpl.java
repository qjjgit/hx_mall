package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.mapper.GoodsCateMapper;
import com.hx.mall.pojo.GoodsCate;
import com.hx.mall.service.GoodsCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * goods_categories商品类别表(GoodsCate)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:28
 */
@Service("goodsCateService")
public class GoodsCateServiceImpl extends ServiceImpl<GoodsCateMapper, GoodsCate> implements GoodsCateService {

    private final GoodsCateMapper goodsCateMapper;

    @Autowired
    public GoodsCateServiceImpl(GoodsCateMapper goodsCateMapper) {
        this.goodsCateMapper = goodsCateMapper;
    }
}
