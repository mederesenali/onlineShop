package com.example.hw.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Integer id) {

        super(String.format("Product with Id %d not found", id));

    }
}
