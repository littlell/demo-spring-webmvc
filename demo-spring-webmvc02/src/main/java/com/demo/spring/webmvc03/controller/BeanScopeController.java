package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.bean.ApplicationBean;
import com.demo.spring.webmvc03.bean.RequestBean;
import com.demo.spring.webmvc03.bean.SessionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/scope")
public class BeanScopeController {
  @Autowired
  private ApplicationContext context;

  @RequestMapping("request")
  @ResponseBody
  public String request() {
    return context.getBean("requestBean", RequestBean.class).toString();
  }

  @RequestMapping("session")
  @ResponseBody
  public String session() {
    return context.getBean("sessionBean", SessionBean.class).toString();
  }

  @RequestMapping("application")
  @ResponseBody
  public String application() {
    return context.getBean("applicationBean", ApplicationBean.class).toString();
  }
}
