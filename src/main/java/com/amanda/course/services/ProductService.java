package com.amanda.course.services;

import com.amanda.course.entities.Product;
import com.amanda.course.exceptions.ControllerNotFoundException;
import com.amanda.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ControllerNotFoundException(id));
    }

}
