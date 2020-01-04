package com.lee.foodselector.interfaces;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class WelcomeController {

  @GetMapping("/")
  public  String hello(){
    return "Hello, 자동배포 테스트";
  }
}
