package com.example.project.serviceproduct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController{

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "Hello from springboot";
    }
}
