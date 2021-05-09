package com.hx.mall.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * goods_categories商品类别表(GoodsCate)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-29 16:47:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("goods_cate")
public class GoodsCate extends Model<GoodsCate> {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer goodsCateId;

    private Integer pid;

    private String name;

    private Object sort;

    private Date createdTime;

    private Date updatedTime;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.goodsCateId;
    }
}
