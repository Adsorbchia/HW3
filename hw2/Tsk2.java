package org.example.seminar3.hw2;

import org.example.seminar3.hw2.model.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tsk2 {
    public static void main(String[] args) {
        Article ar1 = new Article("ghg", "FR", 150.0, 99.99, 1);
        Article ar2 = new Article("ert", "KHR", 150.0, 120.99, 1);
        Article ar3 = new Article("prp", "GB", 150.0, 69.99, 3);
        Article ar4 = new Article("ghg", "GB", 150.0, 80.00, 1);
        Article ar5 = new Article("ert", "RU", 150.0, 93.99, 1);
        Article ar6 = new Article("ghg", "HGH", 77.0, 99.99, 3);
        Article ar7 = new Article("hgh", "HGH", 15.0, 9.9, 2);
        List<Article> ArticleList = new ArrayList<>();
        ArticleList.add(ar1);
        ArticleList.add(ar2);
        ArticleList.add(ar3);
        ArticleList.add(ar4);
        ArticleList.add(ar5);
        ArticleList.add(ar6);
        ArticleList.add(ar7);
        Scanner sc = new Scanner(System.in);
        List<String> Name = new ArrayList<>();
        int sortArt = sc.nextInt();
        double min = 0;
        for (int i = 0; i < ArticleList.size(); i++) {
            if (ArticleList.get(i).getSort() == sortArt) {
                min = minPrice(ArticleList, ArticleList.get(i).getName(),ArticleList.get(i).getSort());
                if (min==ArticleList.get(i).getPrice()){
                    Name.add(ArticleList.get(i).getName());
                }
            }
        }
        System.out.println(Name);
        sc.close();
    }

    private static double minPrice(List<Article> articleList, String name, int sort) {
        double minP = 0;
        for (int i = 0; i < articleList.size(); i++) {
            if (articleList.get(i).getName().equals(name)&& articleList.get(i).getSort()==sort) {
                minP = articleList.get(i).getPrice();
                    if (minP > articleList.get(i).getPrice()) {
                        minP = articleList.get(i).getPrice();
                    }
            }
        }
        return minP;

    }
}