package com.example.springDeveloper.controllers;

import com.example.springDeveloper.domain.User;
import com.example.springDeveloper.servces.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.findHello("Renan");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id,  @RequestBody User body){
        return "ID : " + id + " Nome : " + body.getEmail();
    }
}
