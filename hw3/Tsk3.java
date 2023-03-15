package org.example.seminar3.hw3;

import org.example.seminar3.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Tsk3 {
    public static void main(String[] args) {
        Book book1 = new Book("Город","Петров", 499.8,2021,11);
        Book book2 = new Book("Энциклопедия","Иванов", 900.9,1980,20);
        Book book3 = new Book("Детство","Михайлова", 200.60,1970,33);
        Book book4 = new Book("Руководство пользователей","Антонов", 199.9,2010,13);
        Book book5 = new Book("Идиот","Достоевский", 350.9,1980,220);
        List<Book> ListBook = new ArrayList<>();
        ListBook.add(book1);
        ListBook.add(book2);
        ListBook.add(book3);
        ListBook.add(book4);
        ListBook.add(book5);
        for (Book el:ListBook) {
            if (el.getSurnameA().startsWith("А") && el.getYearPublic()>=2010 && CheckPrimeNum(el.getPages())){
                System.out.println(el.getNameBook());
            }
        }

    }

    private static boolean CheckPrimeNum(int pages) {
        if (pages==2){
            return true;
        }
        if (pages>2){
            for (int i = 2; i < pages; i++) {
                if(pages%i==0){
                    return false;
                }
            }
        }return true;
    }
}
