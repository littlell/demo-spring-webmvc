package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/session")
@SessionAttributes(value = {"userId"})
public class SessionValueController {

  @RequestMapping("/create")
  public String createSession(Model model) {
    model.addAttribute("userId", "1111111111");
    return "hello";
  }

  @RequestMapping
  @ResponseBody
  public String session(@SessionAttribute String userId) {
    return userId;
  }
}
