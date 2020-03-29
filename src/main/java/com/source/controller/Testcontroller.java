package com.source.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class Testcontroller {

    @GetMapping("hello")
    public String show(){

        return "hello world";
    }


}
