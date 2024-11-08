package com.daniellaera.test_bunnysh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class HelloController {

    @Value("${frontend.url}")
    private String frontendUrl;

    @GetMapping
    public String hello() {
        List<String> messages = Arrays.asList(
                "Hello World!",
                "Frontend URL : " + frontendUrl,
                "API Status: Operational",
                "Environment: Production"
        );

        return messages.stream().collect(Collectors.joining("\n"));
    }
}
