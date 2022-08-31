package com.ssm.dao;

import org.apache.ibatis.annotations.Insert;

import java.util.Date;

/**
 * Created by e1hax on 2022-08-31.
 */
public interface LogDao {

    @Insert("insert into tbl_log (info,date) values(#{info},now())")
    void log(String info);

}
