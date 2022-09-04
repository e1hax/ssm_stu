package com.sboot.dao;

import com.sboot.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author e1hax
 * @date 2022-09-04
 */
@Mapper
public interface BookDao {

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
