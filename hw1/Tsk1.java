package org.example.seminar3.hw1;

import org.example.seminar3.hw1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Tsk1 {
    /**
     * 1. Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го
     * или 2го сорта среди товаров, название которых содержит «высший».
     * @param args
     */
    public static void main(String[] args) {
        Product product1 = new Product("Гречка, сорт высший",79.9,2 );
        Product product2 = new Product("Рис",55.8,2);
        Product product3 = new Product("Рис высший",90.8,3);
        Product product4 = new Product("Макароны высший класс",121.5,1);
        Product product5 = new Product("Рис",60.3,3 );

        List <Product> ListProduct = new ArrayList<>();
        ListProduct.add(product1);
        ListProduct.add(product2);
        ListProduct.add(product3);
        ListProduct.add(product4);
        ListProduct.add(product5);
        double max=0;
        String word="высший";
        for (Product el: ListProduct) {
            if (CheckNameProduct( el.getNameProduct(),word) && (el.getSortProduct()==1 || el.getSortProduct()==2)){
                 if (max < el.getPriceProduct()){
                     max = el.getPriceProduct();
                 }

            }

        }
        System.out.println(max);

    }

    private static boolean CheckNameProduct( String nameProduct, String word) {
        String [] text = nameProduct.split("");
        for (String el: text) {
            if(el.equals(word)){
                return true;

        }

        }
        return true;
    }
}
