package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/consume")
public class ConsumeController {
    @RequestMapping(value = "/json", method = RequestMethod.POST, consumes = "application/json")
    public String addPet(@RequestBody User user) {
        return "consume";
    }
}
