package com.example.WWW_week09.controllers;

import com.example.WWW_week09.models.ProductImage;
import com.example.WWW_week09.services.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class ProductImageController {
    @Autowired
    private ProductImageService productImageService;

    @GetMapping("/getAllProductImage")
    public List<ProductImage> findAll(){
        return productImageService.findAll();
    }
}
