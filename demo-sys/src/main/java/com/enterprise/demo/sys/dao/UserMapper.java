package com.enterprise.demo.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.enterprise.demo.sys.entity.User;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 */
public interface UserMapper extends BaseMapper<User> {

    int updateLastLoginTime(User user);
}
