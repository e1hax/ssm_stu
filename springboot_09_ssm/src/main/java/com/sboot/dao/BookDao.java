package com.sboot.dao;

import com.sboot.domain.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by e1hax on 2022-09-02.
 */
@Mapper
public interface BookDao {

    @Insert("insert into tbl_book (type,name,description) values (#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update tbl_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public int update(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from tbl_book where id=#{id}")
    public Book getById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> getAll();
}
