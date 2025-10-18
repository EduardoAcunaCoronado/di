package com.ejemplo.di.services;

import com.ejemplo.di.models.Product;
import com.ejemplo.di.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private ProductRepository productRepository = new ProductRepository();

    public List<Product> getProducts() {
        return productRepository.getProducts().stream().map(p -> {
            p.setPrice(p.getPrice() * 1.21);
            return p;
        }).collect(Collectors.toList());
    }

    public Product getProduct(Long id) {
        return productRepository.getProduct(id);
    }

}
