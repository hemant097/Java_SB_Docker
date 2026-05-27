package com.example.project.serviceproduct.service;

import com.example.project.serviceproduct.entity.Product;
import com.example.project.serviceproduct.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepo;

    public Product createProduct(Product product){
        log.info("saving a new product with id:{}",product.getId());
        return productRepo.save(product);
    }

    public List<Product> allProducts(){
        log.info("getting all products from the DB");
        return productRepo.findAll();
    }
}
