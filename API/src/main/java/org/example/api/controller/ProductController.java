package org.example.api.controller;

import org.example.api.model.Product;
import org.example.api.repository.ProductRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

}