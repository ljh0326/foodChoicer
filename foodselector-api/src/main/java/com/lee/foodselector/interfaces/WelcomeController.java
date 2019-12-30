package com.lee.foodselector.interfaces;

import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Log
public class WelcomeController {

  @GetMapping("/")
  public  String hello(){
    return "Hello, world";
  }


  @GetMapping("/index")
  public ResponseEntity<String> index()  {
    try{

      return new ResponseEntity<>("안녕하세요~~!",HttpStatus.OK);
    }catch (Exception e){
      e.printStackTrace();
      return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
  }
}
