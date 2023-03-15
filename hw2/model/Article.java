package org.example.seminar3.hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {
    private String name;
    private String country;
    private double weight;
    private double price;
    private int sort;
}
