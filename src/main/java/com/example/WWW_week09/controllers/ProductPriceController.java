package com.example.WWW_week09.controllers;

import com.example.WWW_week09.models.ProductPrice;
import com.example.WWW_week09.services.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class ProductPriceController {
    @Autowired
    private ProductPriceService productPriceService;

    @GetMapping("/getAllProductPrice")
    public List<ProductPrice> findAll(){
        return productPriceService.findAll();
    }
}
