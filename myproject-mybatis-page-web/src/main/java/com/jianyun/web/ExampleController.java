package com.jianyun.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jianyun.mapper.DemoMapper;
import com.jianyun.model.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ExampleController {

    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping("/list")
    public ModelMap list(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(demoMapper.queryForList());

        return new ModelMap().addAttribute("code", 0)
                .addAttribute("count", pageInfo.getTotal())
                .addAttribute("data", pageInfo.getList());
    }

    @RequestMapping("/add")
    public TestTable add(TestTable testTable) {
        String id = UUID.randomUUID().toString();

        testTable.setId(id);

        demoMapper.add(testTable);

        return testTable;
    }

}