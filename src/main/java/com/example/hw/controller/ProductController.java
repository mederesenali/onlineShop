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

//    @PostMapping(path="/index")
//    public @ResponseBody
//    String addProduct (@RequestParam String name, @RequestParam String description,
//                      @RequestParam int price, @RequestParam int quantity) {
//
//        Product n = new Product();
//        n.setName(name);
//        n.setDescription(description);
//        n.setPrice(price);
//        n.setQuantity(quantity);
//        productRepository.save(n);
//        return "Saved";
//    }

    @PostMapping("/index")
    public String formPost(Product product, Model model) {
        model.addAttribute("product",product);
        productService.addProduct(product);
        return "result";
    }
}
