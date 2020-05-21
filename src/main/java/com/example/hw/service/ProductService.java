package com.example.hw.service;

import com.example.hw.model.Product;
import com.example.hw.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public List<Product> productList() {
        return (List<Product>) productRepository.findAll();
    }
    public List<Product> productByName(String name){
        return productRepository.findProductByName(name);
    }
    public List<Product> producByDescription(String description){
        return productRepository.findProductByDescription(description);
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void romoveProduct(int  id) {
        productRepository.deleteById(id);
    }


}
