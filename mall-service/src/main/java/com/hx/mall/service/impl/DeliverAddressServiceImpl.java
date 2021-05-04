package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.mapper.DeliverAddressMapper;
import com.hx.mall.pojo.DeliverAddress;
import com.hx.mall.service.DeliverAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户收货地址表(DeliverAddress)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-05-02 16:36:05
 */
@Service("deliverAddressService")
public class DeliverAddressServiceImpl extends ServiceImpl<DeliverAddressMapper, DeliverAddress> implements DeliverAddressService {

    private final DeliverAddressMapper deliverAddressMapper;

    @Autowired
    public DeliverAddressServiceImpl(DeliverAddressMapper deliverAddressMapper) {
        this.deliverAddressMapper = deliverAddressMapper;
    }
}
