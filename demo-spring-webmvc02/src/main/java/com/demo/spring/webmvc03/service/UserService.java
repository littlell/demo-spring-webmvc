package com.demo.spring.webmvc03.service;

import com.demo.spring.webmvc03.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  @Transactional
  public void insert(String name, long age) {
    userRepository.insert(name, age);
  }

  @Transactional(isolation = Isolation.READ_UNCOMMITTED)
  public Integer selectAgeByName(String name) {
    return userRepository.selectAgeByName(name);
  }
}
