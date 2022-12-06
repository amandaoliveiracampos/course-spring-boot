package com.amanda.course.controllers;

import com.amanda.course.entities.Order;
import com.amanda.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// a classe responsavel pela comunicacao REST(responsavel pela comunicacao web)
@RestController
// caminho padrao para meu controle REST
@RequestMapping(value = "/orders")
public class OrderController {

    // annotation responsavel pela injecao de dependencia
    @Autowired
    private OrderService service;

    //findAll significa encontrar todos, nesse caso a lista de order
    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    // findById significa encontrar pelo id, nesse
    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order order = service.findById(id);
        return ResponseEntity.ok().body(order);

    }
}
