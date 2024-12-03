package com.nimap.machinetest.service;

import com.nimap.machinetest.model.Product;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ProductService {
    Page<Product> getAllProducts(int page, int size);
    Product createProduct(Product product);
    Optional<Product> getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
