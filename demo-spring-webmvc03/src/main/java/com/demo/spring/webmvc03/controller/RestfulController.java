package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
public class RestfulController {
    @RequestMapping("/list")
    public Object list() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        return list;
    }

    @RequestMapping("/map")
    public Object map() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        return map;
    }

    @RequestMapping("/object")
    public Object object() {
        User user = new User();
        user.setAge(1);
        user.setName("foo");
        return user;
    }
}
