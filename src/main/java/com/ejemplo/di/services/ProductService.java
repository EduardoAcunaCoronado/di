package com.ejemplo.di.services;

import com.ejemplo.di.models.Product;
import com.ejemplo.di.repositories.ProductRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public interface ProductService {
    List<Product> getProducts();
    Product getProduct(Long id);
}
