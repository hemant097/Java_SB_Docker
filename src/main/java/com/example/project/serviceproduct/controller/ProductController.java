package com.example.project.serviceproduct.controller;

import com.example.project.serviceproduct.entity.Product;
import com.example.project.serviceproduct.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
@RequiredArgsConstructor
public class ProductController{

    private final ProductService productService;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "Hello from springboot";
    }

    @PostMapping("/create")
    public String createProduct(@RequestBody Product productDto){
        productService.createProduct(productDto);
        return "product has been created";
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.allProducts();
    }
}
