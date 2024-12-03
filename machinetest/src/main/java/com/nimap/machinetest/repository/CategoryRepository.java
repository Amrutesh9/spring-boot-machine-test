package com.nimap.machinetest.repository;

import com.nimap.machinetest.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // JpaRepository provides basic CRUD operations
    // Add custom queries here if needed
}
