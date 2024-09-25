package com.example.demo_spring_authentication.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the home page!";
    }

    @GetMapping("/secure")
    public String user(@AuthenticationPrincipal OAuth2User principal) {
        return "Hello, " + principal.getAttribute("name") + "!";
    }
}

