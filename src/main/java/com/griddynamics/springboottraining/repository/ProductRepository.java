package com.griddynamics.springboottraining.repository;

import com.griddynamics.springboottraining.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("shawlRepository")
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
