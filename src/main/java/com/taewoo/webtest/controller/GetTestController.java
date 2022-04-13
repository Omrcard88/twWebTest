package com.taewoo.webtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class GetTestController {

    @GetMapping("/")
    public String getWelcome(){
        System.out.println("welcome");
        return "say to welcome";
    }

    @GetMapping("/list")
    public String getList(){
        System.out.println("list");
        return "list";
    }

    @GetMapping("/login")
    public String getSayWelcome(){
        System.out.println("login");
        return "login";
    }
}
