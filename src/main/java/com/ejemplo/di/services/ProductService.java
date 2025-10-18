package com.ejemplo.di.services;

import com.ejemplo.di.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProduct(Long id);
}
