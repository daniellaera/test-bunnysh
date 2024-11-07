package com.daniellaera.test_bunnysh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @Value("${frontend.url}")
    private String frontendUrl;

    @GetMapping
    public String hello() {
        return "Hello World! Frontend URL: " + frontendUrl;
    }
}
