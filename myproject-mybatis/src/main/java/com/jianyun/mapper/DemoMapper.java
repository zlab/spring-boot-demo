package com.jianyun.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoMapper {

    @Select("select * from a_test_table")
    List<Map> queryForList();

    @Insert("insert into a_test_table (id, name, age)" +
            " values (#{id}, #{name}, #{age})")
    void add(@Param("id") String id,
             @Param("name") String name,
             @Param("age") Integer age);
}
