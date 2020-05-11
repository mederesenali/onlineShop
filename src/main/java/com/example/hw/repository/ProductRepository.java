package com.example.hw.repository;

import com.example.hw.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    Product findByName(String name);
    Product findProductByDescription(String description);
    Product findProductByPrice(int price);
}
