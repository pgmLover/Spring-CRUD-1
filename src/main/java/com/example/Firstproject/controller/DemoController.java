package com.example.Firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public  String hello(){
        return "Hello World";
    }

    @GetMapping("/user")
    public  String user(){
        return "HII USER";
    }

}
