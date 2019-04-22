package com.jianyun.mapper;

import com.jianyun.model.TestTable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {

    @Select("select * from a_test_table")
    List<TestTable> queryForList();

    @Insert("insert into a_test_table (id, name, age)" +
            " values (#{id}, #{name}, #{age})")
    void add(TestTable testTable);
}
