package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.pojo.ShopInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * (ShopInfo)表数据库访问层
 */
@Mapper
@Component
public interface ShopInfoMapper extends BaseMapper<ShopInfo> {
}