package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/regex")
public class RegexController {
    @RequestMapping("/{symbolicName:[a-z-]+}{version:\\d\\.\\d\\.\\d}{extension:\\.[a-z]+}")
    public String handle(@PathVariable String version, @PathVariable String extension) {
        return "regex";
    }
}
