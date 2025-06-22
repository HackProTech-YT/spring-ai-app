package com.hackprotech.myaiapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/greet")
    public String getGreetMessage() {
        return "Hello, Welcome to my Channel!";
    }


}
