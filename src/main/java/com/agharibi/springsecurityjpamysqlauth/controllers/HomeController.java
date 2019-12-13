package com.agharibi.springsecurityjpamysqlauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return ("<h3>Welcome to Spring Security with JPA and MySQL</h3>");
    }

    @GetMapping("/user")
    public String userHome() {
        return ("<h3>Welcome [ user ] to Spring Security with JPA and MySQL</h3>");
    }

    @GetMapping("/admin")
    public String adminHome() {
        return ("<h3>Welcome [ admin ] to Spring Security with JPA and MySQL</h3>");
    }
}
