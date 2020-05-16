package com.example.hw.controller;

import com.example.hw.model.Product;
import com.example.hw.repository.ProductRepository;
import com.example.hw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;



    @RequestMapping()
    public String getMainPage(Model model) {
        model.addAttribute("products", productService.productList());
        return "index";
    }
    @PostMapping()
    public String formPost(Product product, Model model) {

        productService.addProduct(product);
        Iterable<Product> products = productService.productList();

        model.addAttribute("products", products);
        return "index";
    }


    @PostMapping("/filter")
    public String filter(@RequestParam String name,Model model) {
        Iterable<Product> products;

        if (name != null && !name.isEmpty()) {
            products =  productService.productByName(name);
        } else {
            products = productService.productList();
        }

        model.addAttribute("products", products);

        return "index";
    }
    @PostMapping("/byDescription")
    public String findProduct(@RequestParam String description,Model model) {
        Iterable<Product> products;

        if (description != null && !description.isEmpty()) {
            products =  productService.producByDescription(description);
        } else {
            products = productService.productList();
        }

        model.addAttribute("products", products);

        return "index";
    }






}
