package com.cosmin.minuapp.controller;

import com.cosmin.minuapp.model.Tab1;
import com.cosmin.minuapp.repository.Tab1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MinuController {

    @Autowired
    private Tab1Repository repository;

    @GetMapping("/hi")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hi there, Minu!");
    }

    @GetMapping("/tabs")
    public ResponseEntity<List<Tab1>> getAllTabs() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @PostMapping("/tabs")
    public ResponseEntity<Tab1> postTab(@RequestBody Tab1 request) {
        return ResponseEntity.ok().body(repository.save(request));
    }

}
