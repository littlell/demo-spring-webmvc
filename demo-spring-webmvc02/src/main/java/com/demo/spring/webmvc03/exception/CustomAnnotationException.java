package com.demo.spring.webmvc03.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_EXTENDED)
public class CustomAnnotationException extends RuntimeException{
}
