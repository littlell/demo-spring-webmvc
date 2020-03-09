package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.dto.User;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/requestBody")
public class RequestBodyController {
  @RequestMapping( method = RequestMethod.POST, consumes = "application/json")
  public String addPet(@Valid @RequestBody User user) {
    return "consume";
  }
}
