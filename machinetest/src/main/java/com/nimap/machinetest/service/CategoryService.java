package com.nimap.machinetest.service;

import com.nimap.machinetest.model.Category;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface CategoryService {
    Page<Category> getAllCategories(int page, int size);
    Category createCategory(Category category);
    Optional<Category> getCategoryById(Long id);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
