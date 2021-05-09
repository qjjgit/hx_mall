package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.GoodsSku;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * (GoodsSku)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:30
 */
@Mapper
@Component
public interface GoodsSkuMapper extends BaseMapper<GoodsSku> {

}
