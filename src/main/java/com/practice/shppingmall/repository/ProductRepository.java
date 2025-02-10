package com.practice.shppingmall.repository;

import com.practice.shppingmall.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
