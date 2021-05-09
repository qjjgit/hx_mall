package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * (UserInfo)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-04-29 22:07:32
 */
@Mapper
@Component
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
