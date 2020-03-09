package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("insert")
    @ResponseBody
    public String insert(@RequestParam String name, @RequestParam long age) {
        userService.insert(name, age);
        return "success";
    }
}
