package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/basic")
    public String basic(@RequestParam String param1, @RequestParam(required = false) String param2) {
        return "param";
    }

    @RequestMapping("/default")
    public String defaultValue(@RequestParam(defaultValue = "default") String param) {
        return "param";
    }

    @RequestMapping("/path/{param}")
    public String path(@PathVariable String param) {
        return "param";
    }

}
