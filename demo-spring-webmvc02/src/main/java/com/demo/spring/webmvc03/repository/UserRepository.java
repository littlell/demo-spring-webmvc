package com.demo.spring.webmvc03.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void insert(String name, long age) {
//        jdbcTemplate.update("insert into user (name, age) values (?, ?)", name, age);

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        paramMap.put("age", age);
        namedParameterJdbcTemplate.update("insert into user (name, age) values (:name, :age)", paramMap);
    }

    public void update(int id, String name, int age) {
        jdbcTemplate.update("update user set name = ? and age = ? where id = ?", name, age, id);
    }

    public Integer selectAgeByName(String name) {
        Map resp;
        try {
            resp = jdbcTemplate.queryForMap("select age from user where name=? limit 1", name);
        } catch (Exception e) {
            return null;
        }
        return (Integer) resp.get("age");
    }
}
