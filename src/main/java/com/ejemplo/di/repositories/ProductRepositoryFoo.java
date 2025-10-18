package com.ejemplo.di.repositories;

import com.ejemplo.di.models.Product;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> getProducts() {
        return Collections.singletonList(new Product(1L, "Corsair", 300.0));
    }

    @Override
    public Product getProduct(Long id) {
        return new Product(1L, "Corsair", 300.0);
    }
}
