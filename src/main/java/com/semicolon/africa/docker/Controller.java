package com.semicolon.africa.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String returnHelloWorld(){
        return "Hello World";
    }
}
