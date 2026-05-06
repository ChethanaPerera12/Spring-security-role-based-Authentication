package edu.icet.spring_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {
    @GetMapping
    public String getHello(){
        return "Hello";
    }
}
