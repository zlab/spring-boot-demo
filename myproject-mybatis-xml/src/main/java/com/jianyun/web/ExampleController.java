package com.jianyun.web;

import com.jianyun.mapper.DemoMapper;
import com.jianyun.model.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ExampleController {

    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping("/list")
    public List list() {
        return demoMapper.queryForList();
    }

    @RequestMapping("/add")
    public TestTable add(TestTable testTable) {
        String id = UUID.randomUUID().toString();

        testTable.setId(id);

        demoMapper.add(testTable);

        return testTable;
    }

}