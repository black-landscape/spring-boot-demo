package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }

    @RequestMapping("/hello")
    String index() {
        return "Hello World!";
    }

}
