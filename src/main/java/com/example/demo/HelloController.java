package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Sagar! Your first REST API is working.";
    }

    @PostMapping("/greet")
    public String greetUser(@RequestParam String name) {
        return "Hello, " + name + "! Thanks for sending a POST request.";
    }
}