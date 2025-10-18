package com.ejemplo.di.services;

import com.ejemplo.di.models.Product;
import com.ejemplo.di.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.getProducts().stream().map(p -> {
            Double priceTax = p.getPrice() * 1.21;
            Product newProduct = p.clone();
            newProduct.setPrice(priceTax);
            return newProduct;
        }).collect(Collectors.toList());
    }

    public Product getProduct(Long id) {
        return productRepository.getProduct(id);
    }

}
