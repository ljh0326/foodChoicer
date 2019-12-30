package com.lee.foodselector.interfaces;

import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log
public class HomeController {

//    @GetMapping("/index")
//    public ResponseEntity<String> index()  {
//        try{
//
//            return new ResponseEntity<>("안녕하세요~~ 반갑습니다. 추천해주세요", HttpStatus.OK);
//        }catch (Exception e){
//            e.printStackTrace();
//            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
//        }
//    }

    @GetMapping("/index")
    public void index()  {
    }

}
