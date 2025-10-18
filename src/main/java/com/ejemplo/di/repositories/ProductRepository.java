package com.ejemplo.di.repositories;

import com.ejemplo.di.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {
        this.products = Arrays.asList(
            new Product(1L, "Corsair", 300L),
            new Product(2L, "Intel", 850L),
            new Product(3L, "Razer", 180L),
            new Product(4L, "Gigabyte", 490L)
        );
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
