package org.example.sportshop.service;

import org.example.sportshop.entity.Category;
import org.example.sportshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).get();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteById(Integer id) {
        categoryRepository.deleteById(id);
    }

    public Category update(Integer id, Category categoryData) {
        Category existingCategory = getCategoryById(id);
        existingCategory.setName(categoryData.getName());
        return categoryRepository.save(existingCategory);
    }
}

