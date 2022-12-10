package com.amanda.course.services;

import com.amanda.course.entities.Category;
import com.amanda.course.exceptions.ControllerNotFoundException;
import com.amanda.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ControllerNotFoundException(id));
    }

}
