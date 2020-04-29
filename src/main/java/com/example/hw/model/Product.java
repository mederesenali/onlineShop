package com.example.hw.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private int price;
    private int quantity;







}
