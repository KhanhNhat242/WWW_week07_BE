package com.example.WWW_week09.services;

import com.example.WWW_week09.models.ProductImage;
import com.example.WWW_week09.repositories.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductImageService {
    @Autowired
    private ProductImageRepository productImageRepository;

    public void createOrUpdate(ProductImage pi){
        productImageRepository.save(pi);
    }
}
