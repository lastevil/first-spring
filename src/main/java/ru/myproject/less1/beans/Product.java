package ru.myproject.less1.beans;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String title;
    private double price;


    public Product(Integer id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

}
