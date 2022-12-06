package com.amanda.course.repositories;

import com.amanda.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// essa interfece que extends o JpaRepository e respondavel pelo processo automatico do crud do banco de dados.
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
