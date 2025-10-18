package com.ejemplo.di.services;

import com.ejemplo.di.models.Product;
import com.ejemplo.di.repositories.ProductRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {

    private ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();

    public List<Product> getProducts() {
        return productRepositoryImpl.getProducts().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.21;
            Product newProduct = p.clone();
            newProduct.setPrice(priceTax);
            return newProduct;
        }).collect(Collectors.toList());
    }

    public Product getProduct(Long id) {
        return productRepositoryImpl.getProduct(id);
    }

}
