package com.ormispring.test_actions_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/")
  public String hello() {
    return "CICD 테스트입니다. 메롱~";
  }
}
