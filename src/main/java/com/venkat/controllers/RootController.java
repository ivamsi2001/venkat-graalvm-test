package com.venkat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @SuppressWarnings("SameReturnValue")
    @GetMapping
    public String sayHello() {
        return "Lord Venkateswara";
    }
}
