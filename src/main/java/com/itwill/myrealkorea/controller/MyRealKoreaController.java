package com.itwill.myrealkorea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRealKoreaController {
    @GetMapping("/")
    public String home(){
        return "홈";
    }

}
