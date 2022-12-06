package com.amanda.course.services;

import com.amanda.course.entities.Order;
import com.amanda.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// e responsavel por realizar todos os servicos necessarios
@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    // metodo que retorna todos os order em uma lista
    public List<Order> findAll() {
        return repository.findAll();
    }

    // metodo que retorna um order em que o id seja = ao fornecido.
    public Order findById(Long id) {
        Order order = repository.findById(id).get();
        return order;
    }
}



