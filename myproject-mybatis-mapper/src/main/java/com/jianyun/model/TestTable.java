package com.jianyun.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "a_test_table")
public class TestTable {

    @Id
    private String id;

    private String name;
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
