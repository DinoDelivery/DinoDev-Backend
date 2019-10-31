package com.dinodelivery.project.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
