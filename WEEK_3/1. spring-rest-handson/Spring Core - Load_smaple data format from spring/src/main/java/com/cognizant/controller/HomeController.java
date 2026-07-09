package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        return "Welcome to Spring Boot Learning";

    }

    @GetMapping("/hello")
    public String hello() {

        return "Hello Milind!";

    }

}