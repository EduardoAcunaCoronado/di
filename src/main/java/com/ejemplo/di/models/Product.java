package com.ejemplo.di.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product implements Cloneable {
    private Long id;
    private String name;
    private Double price;


    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(this.getId(), this.getName(), this.getPrice());
        }
    }
}
