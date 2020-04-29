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



    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }


    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public Optional<Product> updateProduct(Integer id) {
        return productRepository.findById(id);
    }

}
