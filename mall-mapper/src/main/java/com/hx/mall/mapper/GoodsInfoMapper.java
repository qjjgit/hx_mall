package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * (GoodsInfo)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-04-29 16:08:47
 */
@Mapper
@Component
public interface GoodsInfoMapper extends BaseMapper<GoodsInfo> {

}
