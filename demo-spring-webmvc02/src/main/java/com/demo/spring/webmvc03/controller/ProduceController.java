package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/produce")
public class ProduceController {
  @RequestMapping(value = "", produces = "application/json;charset=UTF-8")
  @ResponseBody
  public User produce() {
    User user = new User();
    user.setName("foo");
    user.setAge(20);
    return user;
  }
}
