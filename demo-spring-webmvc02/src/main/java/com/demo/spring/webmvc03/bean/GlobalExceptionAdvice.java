package com.demo.spring.webmvc03.bean;

import com.demo.spring.webmvc03.exception.AdviceException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice(annotations = RestController.class)
//@ControllerAdvice("org.example.controllers")
//@ControllerAdvice(assignableTypes = {ControllerInterface.class, AbstractController.class})

//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionAdvice {

  @ExceptionHandler(AdviceException.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String ex(AdviceException ae){
    ae.printStackTrace();
    return "error";
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public String ex(Exception e) {
    e.printStackTrace();
    return e.getMessage();
  }
}
