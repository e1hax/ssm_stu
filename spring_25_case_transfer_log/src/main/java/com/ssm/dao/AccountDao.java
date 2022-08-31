package com.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * Created by e1hax on 2022-08-31.
 */
public interface AccountDao {
    /**
     *
     * @param name
     * @param money
     */
    @Update("update tbl_account set money = money + #{money} where name =#{name }")
    void inMoney(@Param("name") String name, @Param("money") int money);

    @Update("update tbl_account set money = money - #{money} where name =#{name }")
    void outMoney(@Param("name")String name,@Param("money")int money);
}
