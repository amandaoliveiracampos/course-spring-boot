package com.amanda.course.repositories;

import com.amanda.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// essa interfece que extends o JpaRepository e respondavel pelo processo automatico do crud do banco de dados.
public interface ProductRepository extends JpaRepository<Product, Long> {
}
