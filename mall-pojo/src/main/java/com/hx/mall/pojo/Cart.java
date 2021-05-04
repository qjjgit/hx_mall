package com.hx.mall.pojo;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (Cart)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-30 09:34:09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("cart")
public class Cart extends Model<Cart> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long cartId;

    private String userId;

    private Long goodsId;

    private Integer goodsNum;

    private Date addedTime;

    private Date updatedTime;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.cartId;
    }

}
