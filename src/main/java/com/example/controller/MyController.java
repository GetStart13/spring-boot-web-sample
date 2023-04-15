package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class MyController {
    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        String welcome = "welcome for spring boot with web";
        System.out.println(welcome);
        return ResponseEntity.ok(welcome);
    }
}
