package com.mbp.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mbp.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by e1hax on 2022-09-05.
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
