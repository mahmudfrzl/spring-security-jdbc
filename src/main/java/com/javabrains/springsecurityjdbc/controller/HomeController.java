package com.javabrains.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String home(){
        return ("<h1>Welcome this is your home</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User, this is your home</h1>");
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin this is your home</h1>");
    }
}
