package com.ormispring.test_actions_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/")
  public String hello() {
    return "CICD 테스트입니다. 메롱~";
  }

  @GetMapping("/test")
  public String test() {
    return "배포 성공했다구요~";
  }
}
