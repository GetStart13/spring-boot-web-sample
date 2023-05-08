package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/example")
public class MyController {
    @PostMapping("/message")
    public ResponseEntity<String> message(@RequestBody Map<String, Object> message) {
        System.out.println("receive message: " + message);
        String welcome = "welcome for spring boot with web";
        System.out.println(welcome);
        return ResponseEntity.ok(welcome);
    }
}
