package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.GoodsPropertyName;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * (GoodsPropertyName)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:29
 */
@Mapper
@Component
public interface GoodsPropertyNameMapper extends BaseMapper<GoodsPropertyName> {

}
