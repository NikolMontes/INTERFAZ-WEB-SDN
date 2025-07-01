package com.example.interfaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home() {
        return "login";
    }

    @GetMapping("/auth")
    public String loginPage() {
        return "login";
    }
}
