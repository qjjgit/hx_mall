package com.hx.mall.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (GoodsSku)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-29 16:48:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("goods_sku")
public class GoodsSku extends Model<GoodsSku> {

    @TableId(value = "id",type = IdType.AUTO)
    private Long goodsSkuId;

    private Long goodsId;

    private String title;

    private Double price;
    //库存
    private Integer stock;
    //商品属性表ID，以逗号分隔
    private String properties;

    private Integer status;

    private Date createdTime;

    private Date updatedTime;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.goodsSkuId;
    }
}
