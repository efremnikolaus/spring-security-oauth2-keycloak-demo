package com.springboot.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
