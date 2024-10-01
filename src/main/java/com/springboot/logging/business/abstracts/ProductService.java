package com.springboot.logging.business.abstracts;

import com.springboot.logging.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product add(Product product);
}
