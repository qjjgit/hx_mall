package com.hx.mall.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * (UserInfo)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-29 22:07:32
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user_info")
public class UserInfo extends Model<UserInfo> {

    @TableId(value = "id", type = IdType.AUTO)
    private String userId;

    private String nickname;

    private String headThumb;

    private String realName;

    // 0女、1男、2未知
    private Integer sex;

    private Date birthday;

    private Date createdTime;

    private Date updatedTime;

    private Integer status;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
