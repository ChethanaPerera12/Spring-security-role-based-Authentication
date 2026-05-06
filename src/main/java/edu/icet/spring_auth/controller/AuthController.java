package edu.icet.spring_auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class AuthController {
    @GetMapping("/customer")
    public String sayHelloCustomer(){
        return "Hello Customer";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String sayHelloAdmin(){
        return "Hello Admin";
    }
}
