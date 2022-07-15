package com.cursojava.cursojava.services;

import com.cursojava.cursojava.entities.Category;
import com.cursojava.cursojava.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository userRepository) {
        this.repository = userRepository;
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.orElse(null);
    }

}
