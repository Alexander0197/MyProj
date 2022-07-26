package com.example.MyProj.repository;

import com.example.MyProj.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
    @Query("FROM Products WHERE providers_trn = :trn")
    public List<Products> getProducts(int trn);
}
