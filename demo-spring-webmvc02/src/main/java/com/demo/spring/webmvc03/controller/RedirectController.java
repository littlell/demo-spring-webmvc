package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/redirect")
public class RedirectController {
    @RequestMapping("/basic")
    public String basic() {
        return "redirect:http://www.baidu.com";
    }

    @RequestMapping("/attributes")
    public String attributes(RedirectAttributes attributes) {
        attributes.addAttribute("from", "foo.com");
        return "redirect:http://www.baidu.com";
    }
}
