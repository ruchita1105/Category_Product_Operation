package com.demo.CRUDoperation.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.CRUDoperation.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Page<Product> findByCategoryId(Long categoryId, org.springframework.data.domain.Pageable pageable);
}
