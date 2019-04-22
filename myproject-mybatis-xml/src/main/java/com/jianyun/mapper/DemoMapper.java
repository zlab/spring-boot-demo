package com.jianyun.mapper;

import com.jianyun.model.TestTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {

    List<TestTable> queryForList();

    void add(TestTable testTable);
}
