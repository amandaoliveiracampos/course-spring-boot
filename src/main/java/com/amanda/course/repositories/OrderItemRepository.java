package com.amanda.course.repositories;

import com.amanda.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

// essa interfece que extends o JpaRepository e respondavel pelo processo automatico do crud do banco de dados.
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
