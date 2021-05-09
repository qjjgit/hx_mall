package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.mapper.GoodsImagesMapper;
import com.hx.mall.entity.GoodsImages;
import com.hx.mall.service.GoodsImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (GoodsImages)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:28
 */
@Service("goodsImagesService")
public class GoodsImagesServiceImpl extends ServiceImpl<GoodsImagesMapper, GoodsImages> implements GoodsImagesService {

    private final GoodsImagesMapper goodsImagesMapper;

    @Autowired
    public GoodsImagesServiceImpl(GoodsImagesMapper goodsImagesMapper) {
        this.goodsImagesMapper = goodsImagesMapper;
    }
}
