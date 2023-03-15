package org.example.seminar3.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String nameProduct;
    private double priceProduct;
    private int sortProduct;
}
