package com.demo.spring.webmvc03.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "application")
public class ApplicationBean {
}
