package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.pojo.GoodsInfo;
import com.hx.mall.mapper.GoodsInfoMapper;
import com.hx.mall.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (GoodsInfo)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-29 16:11:26
 */
@Service("goodsInfoService")
public class GoodsInfoServiceImpl extends ServiceImpl<GoodsInfoMapper, GoodsInfo> implements GoodsInfoService {
    private GoodsInfoMapper goodsInfoMapper;

    @Autowired
    public GoodsInfoServiceImpl(GoodsInfoMapper goodsInfoMapper) {
        this.goodsInfoMapper = goodsInfoMapper;
    }
}
