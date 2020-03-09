package com.demo.spring.webmvc03.controller;


import com.demo.spring.webmvc03.dto.User;
import java.io.IOException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/responseEntity")
public class ResponseEntityController {
    @RequestMapping
    public ResponseEntity<String> handle(HttpEntity<User> requestEntity) throws IOException {
        String requestHeader = requestEntity.getHeaders().getFirst("signature");

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("resp", "success");

        return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
    }
}
