package com.zurum.authclient.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/api/ping")
    public String hello(Principal principal) {
        return "Hello " +principal.getName()+", Welcome to Oauth 2 Demo";
    }


}
