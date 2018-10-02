package com.griddynamics.springboottraining.service;

import com.griddynamics.springboottraining.model.Product;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
public interface ProductService {

    @NotNull Iterable<Product> getAllProducts();

    Product getProduct(@Min(value=1, message = "Invalid product ID") Integer id);

    Product saveProduct(Product product);
}

