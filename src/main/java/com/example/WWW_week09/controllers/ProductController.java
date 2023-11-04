package com.example.WWW_week09.controllers;

import com.example.WWW_week09.models.Product;
import com.example.WWW_week09.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getAllProducts")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product p){
        productService.createOrUpdate(p);
    }

    @PostMapping("/deleteProduct")
    public void deleteProduct(long id){
        productService.delete(id);
    }
}
