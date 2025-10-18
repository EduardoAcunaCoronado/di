package com.ejemplo.di.repositories;

import com.ejemplo.di.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();
    Product getProduct(Long id);
}
