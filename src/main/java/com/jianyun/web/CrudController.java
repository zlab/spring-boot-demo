package com.jianyun.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class CrudController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/list")
    public List list() {
        String sql = "select * from a_test_table";
        return jdbcTemplate.queryForList(sql);
    }

    @RequestMapping("/add")
    public ModelMap add(String name, Integer age) {
        String id = UUID.randomUUID().toString();

        String sql = "insert into a_test_table (id, name, age) values (?,?,?)";

        jdbcTemplate.update(sql, id, name, age);

        return new ModelMap().addAttribute("id", id)
                .addAttribute("name", name)
                .addAttribute("age", age);
    }

}