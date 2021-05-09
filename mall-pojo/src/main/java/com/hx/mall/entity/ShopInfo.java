package com.hx.mall.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (ShopInfo)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-29 11:57:34
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("shop_info")
public class ShopInfo extends Model<ShopInfo> {
    @TableId(value = "id",type = IdType.AUTO)
//    @TableField(insertStrategy = FieldStrategy.IGNORED)
    private Long shopId;
    //店名
    private String shopName;
    //密文
    private String passwordHash;
    //盐
    private String salt;
    //店铺图标url
    private String shopIcon;
    //卖家姓名
    private String sellerName;
    //身份证号
    private String idNumber;

    private String phone;
    //所在地
    private String location;

    private String email;
    //店铺状态
    private Integer status;

    private Date createdTime;

    private Date updatedTime;

    @Override
    protected Serializable pkVal() {
        return this.shopId;
    }
}
