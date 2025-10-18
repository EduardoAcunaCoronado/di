package com.ejemplo.di.repositories;

import com.ejemplo.di.models.Product;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {
        this.products = Arrays.asList(
            new Product(1L, "Corsair", 300.0),
            new Product(2L, "Intel", 850.0),
            new Product(3L, "Razer", 100.0),
            new Product(4L, "Gigabyte", 490.0)
        );
    }

    public Product getProduct(Long id) {
        return products.stream().filter( p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
