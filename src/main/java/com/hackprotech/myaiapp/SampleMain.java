package com.hackprotech.myaiapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleMain implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, Hackpro Tech!");
    }
}
