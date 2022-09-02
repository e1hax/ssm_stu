package com.mvc.dao;

import com.mvc.domain.User;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by e1hax on 2022-09-01.
 */
public interface UserDao {
    @Insert("insert into tbl_user(name,age)values(#{name},#{age})")
    public void save(User user);
}
