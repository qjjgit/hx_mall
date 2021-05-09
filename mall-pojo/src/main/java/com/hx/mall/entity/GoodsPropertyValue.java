package com.hx.mall.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (GoodsPropertyValue)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-29 16:47:56
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("goods_property_value")
public class GoodsPropertyValue extends Model<GoodsPropertyValue> {

    @TableId(value = "id",type = IdType.AUTO)
    private Long goodsPropertyValueId;

    private String title;

    private Long propNameId;

    private Object sort;

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
        return this.goodsPropertyValueId;
    }
}
