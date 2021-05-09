package com.hx.mall.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户收货地址表(DeliverAddress)表实体类
 *
 * @author 覃建嘉
 * @since 2021-05-02 16:36:05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("deliver_address")
public class DeliverAddress extends Model<DeliverAddress> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long deliverAddressId;

    private String userId;
    //收货人性名
    private String consignee;

    private String phone;
    //省
    private String province;
    //市
    private String city;
    //区、乡镇
    private String area;
    //详细地址
    private String detailAddress;
    //邮政编码
    private Integer postcode;

    private Integer isDefault;

    private Date createdTime;

    private Date updatedTime;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.deliverAddressId;
    }

}
