package com.demo.spring.webmvc03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/method")
@RestController
public class MethodController {

  @RequestMapping(value = "/get", method = RequestMethod.GET)
  public String get() {
    return "method";
  }

  @RequestMapping(value = "/post", method = RequestMethod.POST)
  public String post() {
    return "method";
  }

  @RequestMapping(value = "/put", method = RequestMethod.PUT)
  public String put() {
    return "method";
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public String delete() {
    return "method";
  }
}
