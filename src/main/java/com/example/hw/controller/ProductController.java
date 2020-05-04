package com.example.hw.controller;

import com.example.hw.model.Product;
import com.example.hw.repository.ProductRepository;
import com.example.hw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String index() {
        return "redirect:/index";
    }
    @RequestMapping("/index")
    public String getMainPage(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "index";
    }

    @PostMapping("/index")
    public String formPost(Product product, Model model) {
        model.addAttribute("product",product);
        productService.addProduct(product);
        return "result";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("id",id);
        productService.delete(id);
        return "result";
    }



}
