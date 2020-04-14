package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public final class HelloController {

    @GetMapping
    public String sayHello(){
        String message = "Hello ZX!";
        return message;
    }
}
