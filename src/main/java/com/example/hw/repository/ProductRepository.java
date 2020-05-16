package com.example.hw.repository;

import com.example.hw.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findProductByName(String name);
    List<Product> findProductByDescription(String description);
    List<Product> findProductByPrice(int price);
}
