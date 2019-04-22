package com.jianyun.web;

import com.jianyun.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/xml")
public class MybatisXmlController {

    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping("/list")
    public List list() {
        return demoMapper.queryForList();
    }

    @RequestMapping("/add")
    public ModelMap add(String name, Integer age) {
        String id = UUID.randomUUID().toString();

        demoMapper.add(id, name, age);

        return new ModelMap().addAttribute("id", id)
                .addAttribute("name", name)
                .addAttribute("age", age);
    }

}