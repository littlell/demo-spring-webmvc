package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
  @RequestMapping("")
  public String error() {
    return "error";
  }
}
