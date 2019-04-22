package com.jianyun.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoXmlMapper {

    List<Map> queryForPage();

    List<Map> queryForList();
}
