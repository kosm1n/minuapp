package com.cosmin.minuapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinuController {

    @GetMapping("/hi")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hi there, Minu!");
    }

}
