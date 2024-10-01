package com.springboot.logging.dataAccess.abstracts;

import com.springboot.logging.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
