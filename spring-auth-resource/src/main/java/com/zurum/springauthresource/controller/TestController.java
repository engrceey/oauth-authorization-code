package com.zurum.springauthresource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/users")
    public String[] getUser() {
        return new String[]{"zurum", "excel","java"};
    }
}
