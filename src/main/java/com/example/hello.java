package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {
    @GetMapping("/say")
    public String sayHello(){
        return "helloword Spring Boot！";
    }

}