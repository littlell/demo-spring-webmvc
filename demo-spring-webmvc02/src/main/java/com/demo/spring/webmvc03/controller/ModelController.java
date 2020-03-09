package com.demo.spring.webmvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/model")
@Controller
public class ModelController {

  @ModelAttribute
  public void populateModel(@RequestParam String firstName, @RequestParam String lastName, Model model){
    String fullName = firstName + " " + lastName;
    model.addAttribute("initParamValue");
    model.addAttribute("fullName", fullName);
  }

  @RequestMapping("/value")
  public String value(Model model) {
    model.addAttribute("fullName", "bar");
    return "hello";
  }

  @RequestMapping("/populate")
  public String populate(Model model) {
    return "hello";
  }

  @RequestMapping("/modelAndView")
  public ModelAndView method(ModelAndView modelAndView) {
    modelAndView.setViewName("hello");
    return modelAndView;
  }
}
