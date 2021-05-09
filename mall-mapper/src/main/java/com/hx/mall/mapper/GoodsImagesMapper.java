package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.GoodsImages;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * (GoodsImages)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-04-29 21:23:28
 */
@Mapper
@Component
public interface GoodsImagesMapper extends BaseMapper<GoodsImages> {

}
