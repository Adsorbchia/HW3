package org.example.seminar3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String nameBook;
    private String surnameA;
    private double priceBook;
    private int yearPublic;
    private int pages;

}
