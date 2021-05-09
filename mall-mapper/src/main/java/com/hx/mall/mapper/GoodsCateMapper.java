package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.GoodsCate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * goods_categories商品类别表(GoodsCate)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:27
 */
@Mapper
@Component
public interface GoodsCateMapper extends BaseMapper<GoodsCate> {

}
