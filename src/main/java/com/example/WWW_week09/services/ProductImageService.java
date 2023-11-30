package com.example.WWW_week09.services;

import com.example.WWW_week09.models.ProductImage;
import com.example.WWW_week09.repositories.ProductImageRepository;
import com.example.WWW_week09.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageService {
    @Autowired
    private ProductImageRepository productImageRepository;

    public void createOrUpdate(ProductImage pi){
        productImageRepository.save(pi);
    }
    public List<ProductImage> findAll(){
        return productImageRepository.findAll();
    }
    public ProductImage findOne(long id){
        return productImageRepository.findById(id).get();
    }

}
