package com.hx.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hx.mall.entity.UserAuths;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户登录验证表(UserAuths)表数据库访问层
 *
 * @author 覃建嘉
 * @since 2021-04-29 22:07:31
 */
@Mapper
@Component
public interface UserAuthsMapper extends BaseMapper<UserAuths> {
    boolean auth();
}
