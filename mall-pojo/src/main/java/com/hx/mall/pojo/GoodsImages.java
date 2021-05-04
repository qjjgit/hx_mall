package com.hx.mall.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (GoodsImages)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-29 16:47:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("goods_images")
public class GoodsImages extends Model<GoodsImages> {

    @TableId(value = "id",type = IdType.AUTO)
    private Long goodsImageId;

    private Long goodsId;

    private String link;

    private Object position;
    //是否为主图
    private Integer isMaster;

    private Date createdTime;

    private Date updatedTime;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.goodsImageId;
    }
}
