package com.springboot.logging.api.controllers;

import com.springboot.logging.business.abstracts.ProductService;
import com.springboot.logging.entities.Product;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;
    private static final Logger logger = LoggerFactory.getLogger(ProductsController.class);

    @GetMapping("/getall")
    public List<Product> getAll() {
        logger.info("Fetching all products");
        return productService.getAll();
    }

    @PostMapping("/add")
    public Product add(@RequestBody Product product) {
        logger.info("Adding product: {}", product);
        return productService.add(product);
    }
}
