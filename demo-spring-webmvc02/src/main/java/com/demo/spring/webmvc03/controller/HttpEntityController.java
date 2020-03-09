package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.dto.User;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/httpEntity")
public class HttpEntityController {
  @RequestMapping
  @ResponseBody
  public String addPet(HttpEntity<User> userEntity) {
    return "entity";
  }
}
