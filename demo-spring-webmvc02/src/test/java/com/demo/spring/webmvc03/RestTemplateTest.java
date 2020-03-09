package com.demo.spring.webmvc03;

import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {

  public RestTemplate restTemplate;

  private final String HOST = "http://localhost:8080";

  @Before
  public void initialize() {
    restTemplate = new RestTemplate();
  }

  @Test
  public void get() {
    ResponseEntity responseEntity = restTemplate.getForEntity(String.format("%s/%s", HOST, "hello"), String.class);
    System.out.println(responseEntity.getStatusCode());
    System.out.println(responseEntity.getBody());
  }

  @Test
  public void post() {
    ResponseEntity responseEntity = restTemplate.postForEntity(String.format("%s/%s", HOST, "method/post"), null, String.class);
    System.out.println(responseEntity.getStatusCode());
    System.out.println(responseEntity.getBody());
  }

  @Test
  public void put() {
    ResponseEntity responseEntity = restTemplate.exchange(String.format("%s/%s", HOST, "method/put"), HttpMethod.PUT, null, String.class);
    System.out.println(responseEntity.getStatusCode());
    System.out.println(responseEntity.getBody());
  }

  @Test
  public void delete() {
    ResponseEntity responseEntity = restTemplate.exchange(String.format("%s/%s", HOST, "method/delete"), HttpMethod.DELETE, null, String.class);
    System.out.println(responseEntity.getStatusCode());
    System.out.println(responseEntity.getBody());
  }

  @Test
  public void requestBody() {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);

    Map<String, Object> paramMap = new HashMap<>();
    paramMap.put("name", "foo");
    paramMap.put("age", 1111);

    HttpEntity entity = new HttpEntity(paramMap, httpHeaders);

    ResponseEntity responseEntity = restTemplate.postForEntity(String.format("%s/%s", HOST, "requestBody"), entity, String.class);
    System.out.println(responseEntity.getStatusCode());
    System.out.println(responseEntity.getBody());
  }
}
