package com.example.MyProj.repository;

import com.example.MyProj.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
