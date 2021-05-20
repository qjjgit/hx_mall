package com.hx.mall.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户登录验证表(UserAuths)表实体类
 *
 * @author 覃建嘉
 * @since 2021-04-30 09:07:19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user_auths")
public class UserAuths extends Model<UserAuths> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long userAuthId;

    private String userId;
    /*
     * phone、username、email、微博、微信
     */
    private int identityType;
    //name、邮箱、phone、微博UID、微信UserName
    private String identifier;
    //pwd_hash、微博access_token、微信token
    private String credential;
    //盐，非第三方认证时需要
    private String salt;

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.userAuthId;
    }

}
