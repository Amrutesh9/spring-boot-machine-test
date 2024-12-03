package com.nimap.machinetest.repository;

import com.nimap.machinetest.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository provides basic CRUD operations
    // Add custom queries here if needed
}