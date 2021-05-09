package com.hx.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.mall.mapper.CartMapper;
import com.hx.mall.entity.Cart;
import com.hx.mall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Cart)表服务实现类
 *
 * @author 覃建嘉
 * @since 2021-04-30 09:34:10
 */
@Service("cartService")
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {

    private final CartMapper cartMapper;

    @Autowired
    public CartServiceImpl(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }
}
