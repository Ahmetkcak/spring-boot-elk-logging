package com.springboot.logging.business.concretes;

import com.springboot.logging.business.abstracts.ProductService;
import com.springboot.logging.dataAccess.abstracts.ProductRepository;
import com.springboot.logging.entities.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;


    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }
}
