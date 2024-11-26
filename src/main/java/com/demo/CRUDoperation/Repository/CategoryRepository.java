package com.demo.CRUDoperation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.CRUDoperation.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
