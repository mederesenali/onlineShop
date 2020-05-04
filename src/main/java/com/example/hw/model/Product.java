package com.example.hw.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;


@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    @Size(min =4,max=100)
    private String name;
    @NotNull
    private String description;
    @NotNull
    @NotNull
    @Positive
    private int price;
    @NotNull
    @PositiveOrZero
    private int quantity;







}
