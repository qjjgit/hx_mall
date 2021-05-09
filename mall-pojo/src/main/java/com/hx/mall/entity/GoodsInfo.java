package com.hx.mall.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (GoodsInfo)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-29 16:03:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("goods_info")
public class GoodsInfo extends Model<GoodsInfo> {
    @TableId(value = "id",type = IdType.AUTO)
    private Long goodsId;

    private String name;

    private Long shopId;
    //未指定分类-1,意为其他分类
    private Integer cateId;

    private Double price;

    private String tags;
    //商品简介
    private String summary;

    private String content;
    //是否上架
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
        return this.goodsId;
    }
}
