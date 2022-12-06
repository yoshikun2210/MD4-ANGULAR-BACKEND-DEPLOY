package com.example.demo.repository;

import com.example.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICateRepository extends JpaRepository<Category,Long> {
    Boolean existsByNameCategory(String nameCategory);
}
