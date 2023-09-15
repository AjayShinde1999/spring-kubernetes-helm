package com.spring.kubernetes.helm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String message(){
        return "3K-Technologies";
    }
}
