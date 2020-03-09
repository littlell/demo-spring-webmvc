package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/header")
public class HttpHeaderController {
    @RequestMapping("")
    @ResponseBody
    public String index(@RequestHeader("Accept-Encoding") String encoding) {
        return encoding;
    }
}
