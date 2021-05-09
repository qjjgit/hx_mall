package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.ShopInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (ShopInfo)表数据库访问层
 */
@Mapper
@Component
public interface ShopInfoMapper extends BaseMapper<ShopInfo> {
    List<ShopInfo> getList();
}