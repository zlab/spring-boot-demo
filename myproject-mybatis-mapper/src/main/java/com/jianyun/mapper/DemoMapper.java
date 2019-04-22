package com.jianyun.mapper;

import com.jianyun.model.TestTable;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface DemoMapper extends BaseMapper<TestTable> {

}
