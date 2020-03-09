package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cookie")
public class CookieValueController {
  @RequestMapping("")
  @ResponseBody
  public String index(@CookieValue("JSESSIONID") String cookie) {
    return cookie;
  }
}
