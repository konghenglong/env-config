package com.kh.envConfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${env}")
    private String environment;

    @GetMapping
    public String getEnvironment() {
        return environment;
    }

}
