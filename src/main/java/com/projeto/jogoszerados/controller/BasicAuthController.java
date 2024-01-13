package com.projeto.jogoszerados.controller;

import com.projeto.jogoszerados.security.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean basicauth() {

        System.out.println("chamou o metodo basicauth");

        return new AuthenticationBean("You are authenticated");
    }
}