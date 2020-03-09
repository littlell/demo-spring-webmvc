package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forward")
public class FowardController {
  @RequestMapping("")
  public String forward() {
    return "forward:hello";
  }
}
