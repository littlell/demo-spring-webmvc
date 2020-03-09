package com.demo.spring.webmvc03.controller;


import com.demo.spring.webmvc03.dto.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/responseEntity")
public class ResponseEntityController {
    @RequestMapping
    public ResponseEntity<String> handle(HttpEntity<byte[]> requestEntity) throws IOException {
        String requestHeader = requestEntity.getHeaders().getFirst("signature");

        byte[] requestBody = requestEntity.getBody();
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(requestBody, User.class);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("resp", "success");

        return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
    }
}
