package com.demo.spring.webmvc03.controller;

import com.demo.spring.webmvc03.exception.AdviceException;
import com.demo.spring.webmvc03.exception.CustomAnnotationException;
import com.demo.spring.webmvc03.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionController {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> handleCustomException(CustomException ex) {
        ResponseEntity<String> responseEntity = new ResponseEntity<String>("error happened", HttpStatus.INTERNAL_SERVER_ERROR);

        return responseEntity;
    }

    @RequestMapping("/handler")
    public String handler() {
        throw new CustomException();
    }

    @RequestMapping("/annotation")
    public String annotation() {
        throw new CustomAnnotationException();
    }

    @RequestMapping("/advice")
    public String advice(){
        throw new AdviceException();
    }
}
