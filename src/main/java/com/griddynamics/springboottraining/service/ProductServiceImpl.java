package com.griddynamics.springboottraining.service;

import com.griddynamics.springboottraining.exception.ResourceNotFoundException;
import com.griddynamics.springboottraining.model.Product;
import com.griddynamics.springboottraining.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {


    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(String.format("%s : %d ","Product Not Found",id)));
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
