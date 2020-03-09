package com.demo.spring.webmvc03.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages= "com.demo.spring.webmvc03", excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class RootConfig {
}
