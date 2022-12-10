package com.amanda.course.services;

import com.amanda.course.entities.Order;
import com.amanda.course.exceptions.ControllerNotFoundException;
import com.amanda.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ControllerNotFoundException(id));
    }

}
