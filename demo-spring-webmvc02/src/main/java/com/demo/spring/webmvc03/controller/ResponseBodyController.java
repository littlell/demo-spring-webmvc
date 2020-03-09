package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/responseBody")
public class ResponseBodyController {
    @RequestMapping("/list")
    @ResponseBody
    public Object list() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        return list;
    }

    @RequestMapping("/map")
    @ResponseBody
    public Object map() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        return map;
    }

    @RequestMapping("/object")
    @ResponseBody
    public Object object() {
        User user = new User();
        user.setAge(1);
        user.setName("foo");
        return user;
    }
}
