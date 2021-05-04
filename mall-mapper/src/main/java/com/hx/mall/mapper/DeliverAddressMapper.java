package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.pojo.DeliverAddress;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户收货地址表(DeliverAddress)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-05-02 16:36:05
 */
@Mapper
@Component
public interface DeliverAddressMapper extends BaseMapper<DeliverAddress> {

}
