package com.springdemo.Myfirstapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

@RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
