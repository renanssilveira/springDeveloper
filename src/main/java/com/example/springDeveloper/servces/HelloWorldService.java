package com.example.springDeveloper.servces;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String findHello(String name){
        return "Hello World ".concat(name);
    }

}
