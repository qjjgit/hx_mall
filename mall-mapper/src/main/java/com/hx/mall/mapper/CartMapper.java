package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * (Cart)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-04-30 09:34:09
 */
@Mapper
@Component
public interface CartMapper extends BaseMapper<Cart> {

}
